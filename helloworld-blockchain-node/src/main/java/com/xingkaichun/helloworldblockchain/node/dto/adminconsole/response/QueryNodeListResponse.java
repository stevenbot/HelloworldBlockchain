package com.xingkaichun.helloworldblockchain.node.dto.adminconsole.response;

import com.xingkaichun.helloworldblockchain.node.dto.nodeserver.Node;

import java.util.List;

/**
 *
 * @author 邢开春 xingkaichun@qq.com
 */
public class QueryNodeListResponse {

    private List<Node> nodeList;




    //region get set

    public List<Node> getNodeList() {
        return nodeList;
    }

    public void setNodeList(List<Node> nodeList) {
        this.nodeList = nodeList;
    }


    //endregion
}
