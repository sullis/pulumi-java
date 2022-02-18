// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.labservices.inputs;

import io.pulumi.core.internal.annotations.InputImport;
import java.lang.String;
import java.util.Objects;


public final class GetGlobalUserOperationStatusArgs extends io.pulumi.resources.InvokeArgs {

    public static final GetGlobalUserOperationStatusArgs Empty = new GetGlobalUserOperationStatusArgs();

    /**
     * The operation url of long running operation
     * 
     */
    @InputImport(name="operationUrl", required=true)
    private final String operationUrl;

    public String getOperationUrl() {
        return this.operationUrl;
    }

    /**
     * The name of the user.
     * 
     */
    @InputImport(name="userName", required=true)
    private final String userName;

    public String getUserName() {
        return this.userName;
    }

    public GetGlobalUserOperationStatusArgs(
        String operationUrl,
        String userName) {
        this.operationUrl = Objects.requireNonNull(operationUrl, "expected parameter 'operationUrl' to be non-null");
        this.userName = Objects.requireNonNull(userName, "expected parameter 'userName' to be non-null");
    }

    private GetGlobalUserOperationStatusArgs() {
        this.operationUrl = null;
        this.userName = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetGlobalUserOperationStatusArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String operationUrl;
        private String userName;

        public Builder() {
    	      // Empty
        }

        public Builder(GetGlobalUserOperationStatusArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.operationUrl = defaults.operationUrl;
    	      this.userName = defaults.userName;
        }

        public Builder setOperationUrl(String operationUrl) {
            this.operationUrl = Objects.requireNonNull(operationUrl);
            return this;
        }

        public Builder setUserName(String userName) {
            this.userName = Objects.requireNonNull(userName);
            return this;
        }

        public GetGlobalUserOperationStatusArgs build() {
            return new GetGlobalUserOperationStatusArgs(operationUrl, userName);
        }
    }
}
