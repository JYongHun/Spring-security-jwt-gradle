# Spring-security-jwt-gradle

<br>
해당 블로그 참고하여 작성함
http://silvernine.me/wp/?p=1078

<br>
postman

```json
{
	"info": {
		"_postman_id": "c09c9d5a-133a-4680-ada8-91b31bdae4b6",
		"name": "Spring Security Test",
		"schema": "https://schema.getpostman.com/json/collection/v2.1.0/collection.json"
	},
	"item": [
		{
			"name": "\b회원가입",
			"request": {
				"method": "POST",
				"header": [],
				"url": {
					"raw": "http://localhost:8080/api/signup",
					"protocol": "http",
					"host": [
						"localhost"
					],
					"port": "8080",
					"path": [
						"api",
						"signup"
					]
				}
			},
			"response": []
		},
		{
			"name": "유저 토큰발급",
			"request": {
				"method": "POST",
				"header": [],
				"body": {
					"mode": "raw",
					"raw": "{\n    \"username\":\"admin\",\n    \"password\":\"admin\"\n}",
					"options": {
						"raw": {
							"language": "json"
						}
					}
				},
				"url": {
					"raw": "http://localhost:8080/api/authenticate",
					"protocol": "http",
					"host": [
						"localhost"
					],
					"port": "8080",
					"path": [
						"api",
						"authenticate"
					]
				}
			},
			"response": []
		},
		{
			"name": "유저조회 (일반유저)403",
			"request": {
				"auth": {
					"type": "bearer",
					"bearer": [
						{
							"key": "token",
							"value": "eyJhbGciOiJIUzUxMiJ9.eyJzdWIiOiJBQkMiLCJhdXRoIjoiUk9MRV9VU0VSIiwiZXhwIjoxNjQ0MzEyMDkwfQ.7KOvJBD_LICa4gTOnkFAuWinwu9ar2wpHzHGHsOcSxF1SDzTwnOBpuua0bTu7-vAbAYS4Hh1XDA1jDpXYmhrnQ",
							"type": "string"
						}
					]
				},
				"method": "GET",
				"header": [],
				"url": {
					"raw": "localhost:8080/api/user/ABC",
					"host": [
						"localhost"
					],
					"port": "8080",
					"path": [
						"api",
						"user",
						"ABC"
					]
				}
			},
			"response": []
		},
		{
			"name": "유저조회 관리자",
			"request": {
				"auth": {
					"type": "bearer",
					"bearer": [
						{
							"key": "token",
							"value": "eyJhbGciOiJIUzUxMiJ9.eyJzdWIiOiJhZG1pbiIsImF1dGgiOiJST0xFX0FETUlOLFJPTEVfVVNFUiIsImV4cCI6MTY0NDMxMjE5MX0.dUS6ytXY52QZ7mT_tzhOved_gJurOUvzu_a5s5CCEVLGU-RmqtMETyq6uN5PBHJoJdcn4poBrtEzLGxZBorBgg",
							"type": "string"
						}
					]
				},
				"method": "GET",
				"header": [],
				"url": {
					"raw": "localhost:8080/api/user/ABC",
					"host": [
						"localhost"
					],
					"port": "8080",
					"path": [
						"api",
						"user",
						"ABC"
					]
				}
			},
			"response": []
		}
	]
}
```
