# Shade_Tube



제23회 스타트업 위크엔드 – Startup Weekend<br>
17/4/28 ~ 17/4/30
<br><br>
2~30대 여성들을 위한 최고의 앱
<br>
저작권 문제로 drawable 폴더에 있는 사진 파일들을 삭제함


### 해결한 문제들

1. YoutubePlayer API를 이용해 앱에서 Youtube 동영상 띄우기
2. 화면 전체를 꽉 채우는 ImageButton을 이용해 클릭시 다음 사진으로 넘어가는 방식으로 프로토타입 구현
3. SplashActivity를 이용해 앱 기본화면 띄우기

### 해결해야 하는 문제들

1. Java OutOfMemory Error
Drawable 폴더에서 몇십 KB짜리 사진파일 불러오는데 왜 자꾸 에러가 나는지 모르겠다.
일단 사진 파일 크기를 줄이고 largeheap = on으로 바꿨는데도 계속 그러는 거 보면 다른 이유가 있는듯

2. fitXY를 썼을때 화면에 꽉 안차고 약간의 padding 같은 것이 생김
이거 때문에 계속 고통 받았는데,
다음번에는 하나의 액티비티 안에서 여러 setContentView를 이용해 다른 xml을 불러오는 방식으로 구현해야겠다.
