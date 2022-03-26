import cv2
import numpy as np
import time
import hello as pm




#cap = cv2.VideoCapture(0)
pTime = 0
detector = pm.poseDetector()
while True:
    #success, img = cap.read()
    img = cv2.imread('squat-mistake2-true.jpg')
    img = detector.findPose(img)
    lmList = detector.findPosition(img, draw=True)
    if len(lmList) != 0:
        #-------------test01--------------------------------
        #planche
        #print(lmList[23])
        #cv2.circle(img, (lmList[23][1], lmList[23][2]), 15, (0, 0, 255), cv2.FILLED)
        angle1 = detector.findAngle(img, 11, 23, 25)
        angle2 = detector.findAngle(img, 23, 25, 27)
        #print(angle1,angle2)
        # if 180<= angle1 <=200 : 
        #     print("Good job")
        # else : 
        #     print("be careful")

        #-------------test02--------------------------------
        #donky
        # if 163 <= angle1 : 
        #     print("Good job")
        # else : 
        #     print("be careful")

        #------------ test03 -------------------------------- 
        #squat
        if 280 <= angle1 <= 300 and angle2 <= 90 : 
            print("Good job")
        else : 
            print("be careful")


        # cTime = time.time()
        # fps = 1 / (cTime - pTime)
        # pTime = cTime

        # cv2.putText(img, str(int(fps)), (70, 50), cv2.FONT_HERSHEY_PLAIN, 3,
        #             (255, 0, 0), 3)

    cv2.imshow("Image", img)
       
    
    if cv2.waitKey(1) & 0xFF == ord('q') : 
        break 

#cap.release()
cv2.destroyAllWindows()