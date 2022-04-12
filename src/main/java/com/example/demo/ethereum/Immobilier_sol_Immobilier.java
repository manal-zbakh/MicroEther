package com.example.demo.ethereum;

import io.reactivex.Flowable;
import io.reactivex.functions.Function;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.Callable;
import org.web3j.abi.EventEncoder;
import org.web3j.abi.TypeReference;
import org.web3j.abi.datatypes.DynamicStruct;
import org.web3j.abi.datatypes.Event;
import org.web3j.abi.datatypes.Type;
import org.web3j.abi.datatypes.Utf8String;
import org.web3j.abi.datatypes.generated.Uint256;
import org.web3j.crypto.Credentials;
import org.web3j.protocol.Web3j;
import org.web3j.protocol.core.DefaultBlockParameter;
import org.web3j.protocol.core.RemoteCall;
import org.web3j.protocol.core.RemoteFunctionCall;
import org.web3j.protocol.core.methods.request.EthFilter;
import org.web3j.protocol.core.methods.response.BaseEventResponse;
import org.web3j.protocol.core.methods.response.Log;
import org.web3j.protocol.core.methods.response.TransactionReceipt;
import org.web3j.tuples.generated.Tuple3;
import org.web3j.tx.Contract;
import org.web3j.tx.TransactionManager;
import org.web3j.tx.gas.ContractGasProvider;
@SuppressWarnings("rawtypes")
public class Immobilier_sol_Immobilier extends Contract {
    public static final String BINARY = "60806040526000805534801561001457600080fd5b50610aee806100246000396000f3fe608060405234801561001057600080fd5b50600436106100575760003560e01c80633ca6d1001461005c5780634e02368414610078578063545a153a14610094578063a87d942c146100c4578063dd11eaf2146100e2575b600080fd5b61007660048036038101906100719190610702565b610114565b005b610092600480360381019061008d919061078d565b6101e1565b005b6100ae60048036038101906100a991906107e9565b610210565b6040516100bb9190610904565b60405180910390f35b6100cc61036b565b6040516100d99190610935565b60405180910390f35b6100fc60048036038101906100f791906107e9565b610374565b60405161010b9392919061099a565b60405180910390f35b60008081548092919061012690610a0e565b9190505550604051806060016040528084815260200183815260200182815250600160008054815260200190815260200160002060008201518160000190805190602001906101769291906104ae565b5060208201518160010190805190602001906101939291906104ae565b50604082015181600201559050507fbec241d4245858ae8ceefb22c06c0a02e319886577ef8218a3180cc475da3c3f8383836040516101d49392919061099a565b60405180910390a1505050565b8160016000838152602001908152602001600020600101908051906020019061020b9291906104ae565b505050565b610218610534565b6001600083815260200190815260200160002060405180606001604052908160008201805461024690610a86565b80601f016020809104026020016040519081016040528092919081815260200182805461027290610a86565b80156102bf5780601f10610294576101008083540402835291602001916102bf565b820191906000526020600020905b8154815290600101906020018083116102a257829003601f168201915b505050505081526020016001820180546102d890610a86565b80601f016020809104026020016040519081016040528092919081815260200182805461030490610a86565b80156103515780601f1061032657610100808354040283529160200191610351565b820191906000526020600020905b81548152906001019060200180831161033457829003601f168201915b505050505081526020016002820154815250509050919050565b60008054905090565b600160205280600052604060002060009150905080600001805461039790610a86565b80601f01602080910402602001604051908101604052809291908181526020018280546103c390610a86565b80156104105780601f106103e557610100808354040283529160200191610410565b820191906000526020600020905b8154815290600101906020018083116103f357829003601f168201915b50505050509080600101805461042590610a86565b80601f016020809104026020016040519081016040528092919081815260200182805461045190610a86565b801561049e5780601f106104735761010080835404028352916020019161049e565b820191906000526020600020905b81548152906001019060200180831161048157829003601f168201915b5050505050908060020154905083565b8280546104ba90610a86565b90600052602060002090601f0160209004810192826104dc5760008555610523565b82601f106104f557805160ff1916838001178555610523565b82800160010185558215610523579182015b82811115610522578251825591602001919060010190610507565b5b5090506105309190610555565b5090565b60405180606001604052806060815260200160608152602001600081525090565b5b8082111561056e576000816000905550600101610556565b5090565b6000604051905090565b600080fd5b600080fd5b600080fd5b600080fd5b6000601f19601f8301169050919050565b7f4e487b7100000000000000000000000000000000000000000000000000000000600052604160045260246000fd5b6105d982610590565b810181811067ffffffffffffffff821117156105f8576105f76105a1565b5b80604052505050565b600061060b610572565b905061061782826105d0565b919050565b600067ffffffffffffffff821115610637576106366105a1565b5b61064082610590565b9050602081019050919050565b82818337600083830152505050565b600061066f61066a8461061c565b610601565b90508281526020810184848401111561068b5761068a61058b565b5b61069684828561064d565b509392505050565b600082601f8301126106b3576106b2610586565b5b81356106c384826020860161065c565b91505092915050565b6000819050919050565b6106df816106cc565b81146106ea57600080fd5b50565b6000813590506106fc816106d6565b92915050565b60008060006060848603121561071b5761071a61057c565b5b600084013567ffffffffffffffff81111561073957610738610581565b5b6107458682870161069e565b935050602084013567ffffffffffffffff81111561076657610765610581565b5b6107728682870161069e565b9250506040610783868287016106ed565b9150509250925092565b600080604083850312156107a4576107a361057c565b5b600083013567ffffffffffffffff8111156107c2576107c1610581565b5b6107ce8582860161069e565b92505060206107df858286016106ed565b9150509250929050565b6000602082840312156107ff576107fe61057c565b5b600061080d848285016106ed565b91505092915050565b600081519050919050565b600082825260208201905092915050565b60005b83811015610850578082015181840152602081019050610835565b8381111561085f576000848401525b50505050565b600061087082610816565b61087a8185610821565b935061088a818560208601610832565b61089381610590565b840191505092915050565b6108a7816106cc565b82525050565b600060608301600083015184820360008601526108ca8282610865565b915050602083015184820360208601526108e48282610865565b91505060408301516108f9604086018261089e565b508091505092915050565b6000602082019050818103600083015261091e81846108ad565b905092915050565b61092f816106cc565b82525050565b600060208201905061094a6000830184610926565b92915050565b600082825260208201905092915050565b600061096c82610816565b6109768185610950565b9350610986818560208601610832565b61098f81610590565b840191505092915050565b600060608201905081810360008301526109b48186610961565b905081810360208301526109c88185610961565b90506109d76040830184610926565b949350505050565b7f4e487b7100000000000000000000000000000000000000000000000000000000600052601160045260246000fd5b6000610a19826106cc565b91507fffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffff821415610a4c57610a4b6109df565b5b600182019050919050565b7f4e487b7100000000000000000000000000000000000000000000000000000000600052602260045260246000fd5b60006002820490506001821680610a9e57607f821691505b60208210811415610ab257610ab1610a57565b5b5091905056fea26469706673582212207f21cf37446d5e3c6e08bfe8160b7b2f347a02c61d7c6175bdcc695d11a2e88664736f6c634300080b0033";

    public static final String FUNC_LIST = "List";

    public static final String FUNC_CREATE = "create";

    public static final String FUNC_GETCOUNT = "getCount";

    public static final String FUNC_GETID = "getId";

    public static final String FUNC_SETOWNER = "setOwner";

    public static final Event SHOW_EVENT = new Event("show", 
            Arrays.<TypeReference<?>>asList(new TypeReference<Utf8String>() {}, new TypeReference<Utf8String>() {}, new TypeReference<Uint256>() {}));
    ;

    @Deprecated
    protected Immobilier_sol_Immobilier(String contractAddress, Web3j web3j, Credentials credentials, BigInteger gasPrice, BigInteger gasLimit) {
        super(BINARY, contractAddress, web3j, credentials, gasPrice, gasLimit);
    }

    protected Immobilier_sol_Immobilier(String contractAddress, Web3j web3j, Credentials credentials, ContractGasProvider contractGasProvider) {
        super(BINARY, contractAddress, web3j, credentials, contractGasProvider);
    }

    @Deprecated
    protected Immobilier_sol_Immobilier(String contractAddress, Web3j web3j, TransactionManager transactionManager, BigInteger gasPrice, BigInteger gasLimit) {
        super(BINARY, contractAddress, web3j, transactionManager, gasPrice, gasLimit);
    }

    protected Immobilier_sol_Immobilier(String contractAddress, Web3j web3j, TransactionManager transactionManager, ContractGasProvider contractGasProvider) {
        super(BINARY, contractAddress, web3j, transactionManager, contractGasProvider);
    }

    public List<ShowEventResponse> getShowEvents(TransactionReceipt transactionReceipt) {
        List<Contract.EventValuesWithLog> valueList = extractEventParametersWithLog(SHOW_EVENT, transactionReceipt);
        ArrayList<ShowEventResponse> responses = new ArrayList<ShowEventResponse>(valueList.size());
        for (Contract.EventValuesWithLog eventValues : valueList) {
            ShowEventResponse typedResponse = new ShowEventResponse();
            typedResponse.log = eventValues.getLog();
            typedResponse._id = (String) eventValues.getNonIndexedValues().get(0).getValue();
            typedResponse._owner = (String) eventValues.getNonIndexedValues().get(1).getValue();
            typedResponse._cout = (BigInteger) eventValues.getNonIndexedValues().get(2).getValue();
            responses.add(typedResponse);
        }
        return responses;
    }

    public Flowable<ShowEventResponse> showEventFlowable(EthFilter filter) {
        return web3j.ethLogFlowable(filter).map(new Function<Log, ShowEventResponse>() {
            @Override
            public ShowEventResponse apply(Log log) {
                Contract.EventValuesWithLog eventValues = extractEventParametersWithLog(SHOW_EVENT, log);
                ShowEventResponse typedResponse = new ShowEventResponse();
                typedResponse.log = log;
                typedResponse._id = (String) eventValues.getNonIndexedValues().get(0).getValue();
                typedResponse._owner = (String) eventValues.getNonIndexedValues().get(1).getValue();
                typedResponse._cout = (BigInteger) eventValues.getNonIndexedValues().get(2).getValue();
                return typedResponse;
            }
        });
    }

    public Flowable<ShowEventResponse> showEventFlowable(DefaultBlockParameter startBlock, DefaultBlockParameter endBlock) {
        EthFilter filter = new EthFilter(startBlock, endBlock, getContractAddress());
        filter.addSingleTopic(EventEncoder.encode(SHOW_EVENT));
        return showEventFlowable(filter);
    }

    public RemoteFunctionCall<Tuple3<String, String, BigInteger>> List(BigInteger param0) {
        final org.web3j.abi.datatypes.Function function = new org.web3j.abi.datatypes.Function(FUNC_LIST, 
                Arrays.<Type>asList(new org.web3j.abi.datatypes.generated.Uint256(param0)), 
                Arrays.<TypeReference<?>>asList(new TypeReference<Utf8String>() {}, new TypeReference<Utf8String>() {}, new TypeReference<Uint256>() {}));
        return new RemoteFunctionCall<Tuple3<String, String, BigInteger>>(function,
                new Callable<Tuple3<String, String, BigInteger>>() {
                    @Override
                    public Tuple3<String, String, BigInteger> call() throws Exception {
                        List<Type> results = executeCallMultipleValueReturn(function);
                        return new Tuple3<String, String, BigInteger>(
                                (String) results.get(0).getValue(), 
                                (String) results.get(1).getValue(), 
                                (BigInteger) results.get(2).getValue());
                    }
                });
    }

    public RemoteFunctionCall<TransactionReceipt> create(String _id, String _owner, BigInteger _cout) {
        final org.web3j.abi.datatypes.Function function = new org.web3j.abi.datatypes.Function(
                FUNC_CREATE, 
                Arrays.<Type>asList(new org.web3j.abi.datatypes.Utf8String(_id), 
                new org.web3j.abi.datatypes.Utf8String(_owner), 
                new org.web3j.abi.datatypes.generated.Uint256(_cout)), 
                Collections.<TypeReference<?>>emptyList());
        return executeRemoteCallTransaction(function);
    }

    public RemoteFunctionCall<BigInteger> getCount() {
        final org.web3j.abi.datatypes.Function function = new org.web3j.abi.datatypes.Function(FUNC_GETCOUNT, 
                Arrays.<Type>asList(), 
                Arrays.<TypeReference<?>>asList(new TypeReference<Uint256>() {}));
        return executeRemoteCallSingleValueReturn(function, BigInteger.class);
    }

    public RemoteFunctionCall<mycontract> getId(BigInteger _id) {
        final org.web3j.abi.datatypes.Function function = new org.web3j.abi.datatypes.Function(FUNC_GETID, 
                Arrays.<Type>asList(new org.web3j.abi.datatypes.generated.Uint256(_id)), 
                Arrays.<TypeReference<?>>asList(new TypeReference<mycontract>() {}));
        return executeRemoteCallSingleValueReturn(function, mycontract.class);
    }

    public RemoteFunctionCall<TransactionReceipt> setOwner(String _owner, BigInteger _index) {
        final org.web3j.abi.datatypes.Function function = new org.web3j.abi.datatypes.Function(
                FUNC_SETOWNER, 
                Arrays.<Type>asList(new org.web3j.abi.datatypes.Utf8String(_owner), 
                new org.web3j.abi.datatypes.generated.Uint256(_index)), 
                Collections.<TypeReference<?>>emptyList());
        return executeRemoteCallTransaction(function);
    }

    @Deprecated
    public static Immobilier_sol_Immobilier load(String contractAddress, Web3j web3j, Credentials credentials, BigInteger gasPrice, BigInteger gasLimit) {
        return new Immobilier_sol_Immobilier(contractAddress, web3j, credentials, gasPrice, gasLimit);
    }

    @Deprecated
    public static Immobilier_sol_Immobilier load(String contractAddress, Web3j web3j, TransactionManager transactionManager, BigInteger gasPrice, BigInteger gasLimit) {
        return new Immobilier_sol_Immobilier(contractAddress, web3j, transactionManager, gasPrice, gasLimit);
    }

    public static Immobilier_sol_Immobilier load(String contractAddress, Web3j web3j, Credentials credentials, ContractGasProvider contractGasProvider) {
        return new Immobilier_sol_Immobilier(contractAddress, web3j, credentials, contractGasProvider);
    }

    public static Immobilier_sol_Immobilier load(String contractAddress, Web3j web3j, TransactionManager transactionManager, ContractGasProvider contractGasProvider) {
        return new Immobilier_sol_Immobilier(contractAddress, web3j, transactionManager, contractGasProvider);
    }

    public static RemoteCall<Immobilier_sol_Immobilier> deploy(Web3j web3j, Credentials credentials, ContractGasProvider contractGasProvider) {
        return deployRemoteCall(Immobilier_sol_Immobilier.class, web3j, credentials, contractGasProvider, BINARY, "");
    }

    public static RemoteCall<Immobilier_sol_Immobilier> deploy(Web3j web3j, TransactionManager transactionManager, ContractGasProvider contractGasProvider) {
        return deployRemoteCall(Immobilier_sol_Immobilier.class, web3j, transactionManager, contractGasProvider, BINARY, "");
    }

    @Deprecated
    public static RemoteCall<Immobilier_sol_Immobilier> deploy(Web3j web3j, Credentials credentials, BigInteger gasPrice, BigInteger gasLimit) {
        return deployRemoteCall(Immobilier_sol_Immobilier.class, web3j, credentials, gasPrice, gasLimit, BINARY, "");
    }

    @Deprecated
    public static RemoteCall<Immobilier_sol_Immobilier> deploy(Web3j web3j, TransactionManager transactionManager, BigInteger gasPrice, BigInteger gasLimit) {
        return deployRemoteCall(Immobilier_sol_Immobilier.class, web3j, transactionManager, gasPrice, gasLimit, BINARY, "");
    }

    public static class mycontract extends DynamicStruct {
        public String id;

        public String owner;

        public BigInteger cout;

        public mycontract(String id, String owner, BigInteger cout) {
            super(new org.web3j.abi.datatypes.Utf8String(id),new org.web3j.abi.datatypes.Utf8String(owner),new org.web3j.abi.datatypes.generated.Uint256(cout));
            this.id = id;
            this.owner = owner;
            this.cout = cout;
        }

        public mycontract(Utf8String id, Utf8String owner, Uint256 cout) {
            super(id,owner,cout);
            this.id = id.getValue();
            this.owner = owner.getValue();
            this.cout = cout.getValue();
        }
    }

    public static class ShowEventResponse extends BaseEventResponse {
        public String _id;

        public String _owner;

        public BigInteger _cout;
    }
}
