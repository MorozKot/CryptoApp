package com.example.cryptoapp.domain

class GetOneCoinInfoUseCase(
    private val repository: CoinRepository
) {

    operator fun invoke(fromSymbol: String) = repository.getOneCoinInfo(fromSymbol)
}
