import axios from 'axios'
import router from '../router'
const state = {
    context: 'http://localhost:3000/',
    player : {},
    fail : false,
    auth : false
}

const actions = {
    async login({commit}, loginData){
        const url = state.context + `players/${loginData.playerId}/access`

        const headers = {
            authorization: 'JWT fefege..',
            Accept : 'application/json',
            'Content-Type': 'application/json'
        }

        axios.post(url, loginData, headers)


            .then(({data})=>{
                if(data.result){
                    commit('LOGIN_COMMIT', data)
                }else{
                    commit('FAIL_COMMIT')
                }

            })


            .catch(()=>{
                alert('서버 전송 실패')
                state.fail = true
            })

    },
    async logout({commit}){
        alert('로그아웃 2')
        commit('LOGOUT_COMMIT')
    }
}


const mutations = {
    LOGIN_COMMIT(state, data){
        state.auth = true
        state.player = data.player
        localStorage.setItem('token', data.token)
        localStorage.setItem('playerId', data.player.playerId)
        if(data.player.teamId !== 'K01'){
            alert('일반 사용자')
            /*일반 사용자*/
            router.push('/')
        }else{
            alert('관리자')
            /* 관리자 */
        }

    },

    FAIL_COMMIT(state){
    state.fail = true
    },

    LOGOUT_COMMIT(state){
        alert('로그아웃3')
        localStorage.clear()
        state.auth = false
        state.player = {}
    }


}


const getters = {

}


export default {
    name: 'player',
    namespaced : true,
    state,
    actions,
    mutations,
    getters
}