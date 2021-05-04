package com.example.home_hackathon2.usecase

import com.example.home_hackathon2.model.common.SimpleResult
import com.example.home_hackathon2.usecase.common.ICoCommandUseCase

interface LeaveRoomUseCase : ICoCommandUseCase<Unit, SimpleResult<Unit>>
