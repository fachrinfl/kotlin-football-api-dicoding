package com.example.fachrinfl.football_club_api.main

import com.example.fachrinfl.football_club_api.model.Team

interface MainView {
    fun showLoading()
    fun hideLoading()
    fun showTeamList(data: List<Team>)
}