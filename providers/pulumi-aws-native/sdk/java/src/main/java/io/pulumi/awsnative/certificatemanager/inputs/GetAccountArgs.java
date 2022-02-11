// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.certificatemanager.inputs;

import io.pulumi.core.internal.annotations.InputImport;
import java.lang.String;
import java.util.Objects;


public final class GetAccountArgs extends io.pulumi.resources.InvokeArgs {

    public static final GetAccountArgs Empty = new GetAccountArgs();

    @InputImport(name="accountId", required=true)
    private final String accountId;

    public String getAccountId() {
        return this.accountId;
    }

    public GetAccountArgs(String accountId) {
        this.accountId = Objects.requireNonNull(accountId, "expected parameter 'accountId' to be non-null");
    }

    private GetAccountArgs() {
        this.accountId = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetAccountArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String accountId;

        public Builder() {
    	      // Empty
        }

        public Builder(GetAccountArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.accountId = defaults.accountId;
        }

        public Builder setAccountId(String accountId) {
            this.accountId = Objects.requireNonNull(accountId);
            return this;
        }

        public GetAccountArgs build() {
            return new GetAccountArgs(accountId);
        }
    }
}
