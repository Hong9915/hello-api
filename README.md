# Hello API

간단한 Spring Boot 기반 REST API 예제 프로젝트입니다.
엔드포인트 /hello 에서 현재 한국 시간과 간단한 메시지를 JSON으로 반환합니다.


📌 프로젝트 구조
	•	Framework: Spring Boot 3.x
	•	Language: Java 17
	•	Build Tool: Gradle
	•	Main Endpoint: /hello

# 로컬 실행

```
./gradlew bootRun
```
접속: http://localhost:8080/hello

```
./gradlew clean bootJar
java -jar build/libs/hello-api-0.0.1-SNAPSHOT.jar
```

# 파일 업로드
```
scp -i <key.pem> app.jar start.sh ubuntu@<EC2_IP>:/home/ubuntu/
```

# 원격 실행
```
ssh -i <key.pem> ubuntu@<EC2_IP> "cd /home/ubuntu && chmod +x start.sh && ./start.sh"
```

# 원격 종료

```
ssh -i <key.pem> ubuntu@<EC2_IP> "cd /home/ubuntu && chmod +x stop.sh && ./stop.sh"
```


# 도커화

# 도커 빌드
```
./gradlew clean bootJar
docker buildx build --platform linux/amd64 -t hyungjune03/hello-api:1.0 --load .
```
# 도커 실행 및 테스트
```
docker run -d --name hello-api -p 8080:8080 hyungjune03/hello-api:1.0

curl http://localhost:8080/hello
```