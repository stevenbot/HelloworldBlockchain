package com.xingkaichun.helloworldblockchain.node.dto.blockchainbrowser.response;

import com.xingkaichun.helloworldblockchain.node.dto.wallet.WalletDTO;

/**
 *
 * @author 邢开春 xingkaichun@qq.com
 */
public class GenerateWalletResponse {

    private WalletDTO walletDTO;




    //region get set

    public WalletDTO getWalletDTO() {
        return walletDTO;
    }

    public void setWalletDTO(WalletDTO walletDTO) {
        this.walletDTO = walletDTO;
    }

    //endregion
}
