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
    
//    var client = DropboxClientsManager.authorizedClient!
//    var client2 = DropboxClient(accessToken: "tmEBrebR6QUAAAAAAAAxCTGzhJHxUrDRTmBr21Xrzr28UnmPt2ph0XVLFB59L2-2")
//
//    var fileData = "testing data example".data(using: String.Encoding.utf8, allowLossyConversion: false)!
//    var textContent = "Hello swift Upload" //.data(using: String.Encoding.utf8)
    
    override func viewDidLoad() {
        super.viewDidLoad()
    }
    
    @IBAction func btLogin2(_ sender: Any) {
        
    }
    
    @IBAction func btLogin(_ sender: Any) {
        DropboxClientsManager.authorizeFromController(UIApplication.shared,
                                                      controller: self,
                                                      openURL: { (url: URL) -> Void in
                                                        UIApplication.shared.canOpenURL(url)
        })
    }
    
//    // Download to URL
//    let fileManager = FileManager.default
//
//    let directoryURL = fileManager.urls(for: .documentDirectory, in: .userDomainMask)[0]
//    let destURL = directoryURL.appendingPathComponent("myTestFile")
//    let destination: (URL, HTTPURLResponse) -> URL = { temporaryURL, response in
//        return destURL
//    }
//    client.files.download(path: "/test/path/in/Dropbox/account", overwrite: true, destination: destination)
//    .response { response, error in
//    if let response = response {
//    print(response)
//    } else if let error = error {
//    print(error)
//    }
//    }
//    .progress { progressData in
//    print(progressData)
//    }
//
//
//    // Download to Data
//    client.files.download(path: "/test/path/in/Dropbox/account")
//    .response { response, error in
//    if let response = response {
//    let responseMetadata = response.0
//    print(responseMetadata)
//    let fileContents = response.1
//    print(fileContents)
//    } else if let error = error {
//    print(error)
//    }
//    }
//    .progress { progressData in
//    print(progressData)
//    }
//
//    let transportClient = DropboxTransportClient(accessToken: "tmEBrebR6QUAAAAAAAAxCTGzhJHxUrDRTmBr21Xrzr28UnmPt2ph0XVLFB59L2-2",
//                                                 baseHosts: nil,
//                                                 userAgent: "CustomUserAgent",
//                                                 selectUser: nil,
//                                                 sessionDelegate: mySessionDelegate,
//                                                 backgroundSessionDelegate: myBackgroundSessionDelegate,
//                                                 serverTrustPolicyManager: myServerTrustPolicyManager)
//
//    DropboxClientsManager.setupWithAppKey("tmEBrebR6QUAAAAAAAAxCTGzhJHxUrDRTmBr21Xrzr28UnmPt2ph0XVLFB59L2-2", transportClient: transportClient)
    
}

