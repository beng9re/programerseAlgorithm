function solution(record) {
    var answer = [];
    const msg = {
        Enter : "들어왔습니다.",
        Leave : "나갔습니다."
    };

    const user = new Map();

    for (let data of record) {
        let [command,id,name] = data.split(" ");

        if (command !== "Change") {
            answer.push({id,msg:msg[command]});
        }
        if (command !== "Leave") {
            user.set(id,name);
        }
    }

    return answer.map(({id,msg}) => `${user.get(id)}님이 ${msg}`);
}