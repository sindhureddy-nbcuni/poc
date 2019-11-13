package com.nbcuni.test.vamservice.utils;

public interface Environment {

    String stage = "stage";
    String QA = "qa";
    String DEV = "dev";

    //String baseUrl = "https://o-"++"-video-ads-module.ad-tech.nbcuni.com/v1/freewheel-params?appName=peacock&brand=peacock&platform=android&adCompatibilityEncodingProfile=CMAF_60&streamType=vod&playerName=playmaker&adServerContentId=nbcsn_Live_SH031457260000&httpReferer=http://example.com&httpUserAgent=Mozilla/5.0%20(Linux;%20Android%208.0.0;%20SM-G955F%20Build/R16NW;%20wv)%20AppleWebKit/537.36%20(KHTML,%20like%20Gecko)%20Version/4.0%20Chrome/74.0.3729.157%20Mobile%20Safari/537.36&deviceAdvertisingIdType=SM-G955F&videoDurationInSeconds=1200&locationPostalCode=91608&deviceAdvertisingId=261fecd7-24d3-401d-935d-cd1f1e750120&deviceAdvertisingTrackingConsent=false&obfuscatedFreewheelProfileId=e33a0a82-3ba6-4369-9347-d98194d5d8c8";

    String healthStatusUrl = "https://o-dev-video-ads-module.ad-tech.nbcuni.com/v1/heartbeat";
}
