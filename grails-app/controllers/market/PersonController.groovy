package market

class PersonController {

    def index() {
        return "another string"
    }

    def hello() {
        redirect([controller: 'pay', action: 'index', params: [name: 'Andrey', lastName: 'Ivanov', p: params]])
    }

}
