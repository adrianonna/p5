//
//  ViewController.swift
//  ProjetoIOS
//
//  Created by IFPB on 10/12/2019.
//  Copyright © 2019 IFPB. All rights reserved.
//

import UIKit
import SwiftyDropbox

class ViewController: UIViewController {
    
    let arrDropboxImages = NSMutableArray()
    
    override func viewDidLoad() {
        super.viewDidLoad()
        // Do any additional setup after loading the view, typically from a nib.
    }
    
    @IBAction func btLogin(_ sender: Any) {
        if (DropboxClientsManager.authorizedClient != nil) {
            
            //User is already authorized
            //Fetch images from user's DropBox folder
            self.getImageFromDropbox()
        } else {
            
            //User not authorized
            //So we go for authorizing user first.
            DropboxClientsManager.authorizeFromController(UIApplication.shared, controller: self, openURL: { (url) in
//                UIApplication.shared.openURL(url)
                UIApplication.shared.canOpenURL(url)
                
                //Fetch images from user's DropBox folder
                self.getImageFromDropbox()
            })
            
        }
    }
    
    func myButtonInControllerPressed() {
        DropboxClientsManager.authorizeFromController(UIApplication.shared,
                                                      controller: self,
                                                      openURL: { (url: URL) -> Void in
                                                        UIApplication.shared.canOpenURL(url)
//                                                        UIApplication.shared.openURL(url)
        })
    }
    
    //Fetch all images from DropBox
    func getImageFromDropbox() {
        
        let client = DropboxClientsManager.authorizedClient
        
        //Get list of folder of dropbox by set (path: "/")
        //Or you can get folder inside a folder by set (path: "/Photos")
        client!.files.listFolder(path: "/Photos/1").response(completionHandler: { (objList, error) in
            if let resultList = objList {
                
                //Create a for loop for getting all the entities individually
                for entry in resultList.entries {
                    
                    //Check if file have metadata or not
                    if let fileMetadata = entry as? Files.FileMetadata {
                        
                        //Check file type by extention .jpg/.png
                        //You can check this by your own added extention
                        if self.isFileImage(filename: fileMetadata.name) == true {
                            
                            //Get Path for save image in document directory
                            let destination : (NSURL, HTTPURLResponse) -> NSURL = { temporaryURL, response in
                                return self.getDocumentDirectoryPath(fileName: fileMetadata.name)
                            }
                            
                            //Download Image on destination path
                            client!.files.download(path: fileMetadata.pathLower!, destination: destination).response { response, error in
                                if let (_, url) = response {
                                    let data = NSData(contentsOfURL: url)
                                    let img = UIImage(data: data!)
                                    
                                    if !self.arrSelectImages.containsObject(img!) {
                                        self.arrSelectImages.addObject(img!)
                                        
                                    }
                                    else {
                                        print("Image already added to array")
                                    }
                                }
                            }
                        } else {
                            //File is not an image
                        }
                    } else {
                        //If file have not metadata it mean it is a folder.
                    }
                    
                }
                
            } else {
                print(error)
            }
        })
    }
    
    //MARK: check for file type
    private func isFileImage(filename:String) -> Bool {
        let lastPathComponent = filename.pathExtension().lowercaseString
        return lastPathComponent == "jpg" || lastPathComponent == "png"
    }
    
    //to get document directory path
    func getDocumentDirectoryPath(fileName:String) -> NSURL {
        let fileManager = NSFileManager.defaultManager()
        let directoryURL = fileManager.URLsForDirectory(.DocumentDirectory, inDomains: .UserDomainMask)[0]
        let UUID = NSUUID().UUIDString
        let pathComponent = "\(UUID)-\(fileName)"
        return directoryURL.URLByAppendingPathComponent(pathComponent)
    }


}

