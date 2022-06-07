// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azure.datashare.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


public final class GetShareArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetShareArgs Empty = new GetShareArgs();

    /**
     * The ID of the Data Share account in which the Data Share is created.
     * 
     */
    @Import(name="accountId", required=true)
    private Output<String> accountId;

    /**
     * @return The ID of the Data Share account in which the Data Share is created.
     * 
     */
    public Output<String> accountId() {
        return this.accountId;
    }

    /**
     * The name of this Data Share.
     * 
     */
    @Import(name="name", required=true)
    private Output<String> name;

    /**
     * @return The name of this Data Share.
     * 
     */
    public Output<String> name() {
        return this.name;
    }

    private GetShareArgs() {}

    private GetShareArgs(GetShareArgs $) {
        this.accountId = $.accountId;
        this.name = $.name;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetShareArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetShareArgs $;

        public Builder() {
            $ = new GetShareArgs();
        }

        public Builder(GetShareArgs defaults) {
            $ = new GetShareArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param accountId The ID of the Data Share account in which the Data Share is created.
         * 
         * @return builder
         * 
         */
        public Builder accountId(Output<String> accountId) {
            $.accountId = accountId;
            return this;
        }

        /**
         * @param accountId The ID of the Data Share account in which the Data Share is created.
         * 
         * @return builder
         * 
         */
        public Builder accountId(String accountId) {
            return accountId(Output.of(accountId));
        }

        /**
         * @param name The name of this Data Share.
         * 
         * @return builder
         * 
         */
        public Builder name(Output<String> name) {
            $.name = name;
            return this;
        }

        /**
         * @param name The name of this Data Share.
         * 
         * @return builder
         * 
         */
        public Builder name(String name) {
            return name(Output.of(name));
        }

        public GetShareArgs build() {
            $.accountId = Objects.requireNonNull($.accountId, "expected parameter 'accountId' to be non-null");
            $.name = Objects.requireNonNull($.name, "expected parameter 'name' to be non-null");
            return $;
        }
    }

}
