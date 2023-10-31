# coolapp : a very simple todo app
![image](https://github.com/dbillion/coolapp/assets/49393855/d4e0a302-94f7-4e74-ad33-2aef293f6b73)
the vs code descriptions makes it easy to see the controllers:
![image](https://github.com/dbillion/coolapp/assets/49393855/4c8af4c1-cce7-4952-b934-9ec139a24270)

curl post command to test the app that its working
![image](https://github.com/dbillion/coolapp/assets/49393855/24416d91-c221-4d56-ac6f-1ea9d5a59724)

get all the post 
![image](https://github.com/dbillion/coolapp/assets/49393855/ebdc074f-ec14-4c2a-a1e2-a53018dfa963)

yes, very clunky, we will use jq tool, very useful
![image](https://github.com/dbillion/coolapp/assets/49393855/48af1c08-9836-4544-966e-e24b0b52a5f3)
put commands
![image](https://github.com/dbillion/coolapp/assets/49393855/d5ffbd60-7aa8-4e72-b7e5-db79a4b3f9b9)
checking the change

![image](https://github.com/dbillion/coolapp/assets/49393855/8f3bdd8b-0b33-458e-a5b0-359551417696)
 these are some of the commands used in testing the app

:1222  curl -i http://localhost:8080/api/todo
 1223  curl -s http://localhost:8080/api/todo | jq
 1224  curl -i -X PUT -H "Content-Type: application/json" -d '{"description":"Take the dog and the cat for a walk", "id":"2d051b67-7716-4ee6-9c45-1de939fa579f"}' http://localhost:8080/api/todo
 1225  curl -s http://localhost:8080/api/todo | jq
 1226  clear
 1227  curl -i -X PUT -H "Content-Type: application/json" -d '{"description":"Take the dog and the cat for a walk", "id":"2d051b67-7716-4ee6-9c45-1de939fa579f"}' http://localhost:8080/api/todo
 1228  curl -s http://localhost:8080/api/todo | jq
 1229  curl -i -X POST -H "Content-Type: application/json" -d '{"description":"Read the Pro Spring Boot 2nd Edition Book"}' http://localhost:8080/api/todo
 1230  curl -i -X POST -H "Content-Type: application/json" -d '{"description":"Read thad the bible"}http://localhost:8080/api/todo
 1231  curl -i -X POST -H "Content-Type: application/json" -d '{"description":"Read thad the bible"}htt'p://localhost:8080/api/todo
 1232  curl -i -X POST -H "Content-Type: application/json" -d '{"description":"Read thad the bible"}http://localhost:8080/api/todo
 1233  curl -i -X POST -H "Content-Type: application/json" -d '{"description":"Read thad the bible"}'http://localhost:8080/api/todo
 1234  curl -i -X POST -H "Content-Type: application/json" -d '{"description":"Read the Pro Spring Boot 2nd Edition Book"}' http://localhost:8080/api/todo
 1235  curl -i http://localhost:8080/api/todo
 1236  curl -i http://localhost:8080/api/todo |jq
 1237  curl -s http://localhost:8080/api/todo | jq
 1238  curl -i -X PUT -He: application/json" -d '{ 
"description":"Take the dog and the cat for a walk", "id":"2"4ee6-9c45-1de939fa579f"}' http://localhost:8080/api/todo
 1239  curl -i -X PUT -H "Content-Type: application/json" -d '{ "description":"Take the dog and the cat for a walk","id":"2d051b67-7716-4ee6-9c45-1de939fa579f"}' http://localhost:8080/api/todo
 1240  curl -s http://localhost:8080/api/todo | jq
 1241  curl -i -X PATCH http://localhost:8080/api/todo/2d051b67-7716-4ee6-9c45-1de939fa579f
 1242  curl -s http://localhost:8080/api/todo/2d051b67-7716-4ee6-9c45-1de939fa579f | jq
 1243  curl -i -X DELETE http://localhost:8080/api/todo/2d051b67-7716-4ee6-9c45-1de939fa579f
 1244  curl -s http://localhost:8080/api/todo | jq
 1245  curl -i -X POST -H "Content-Type: application/json" -d '{"description":""}'http://localhost:8080/api/todo
 1246  curl -i -X POST -H "Content-Type: application/json" -d '{"description":""}' http://localhost:8080/api/todo
 1247  curl -i -X POST -H "Content-Type: application/json" http://localhost:8080/api/todo
