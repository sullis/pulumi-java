// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azure.datashare.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


public final class GetSharePlainArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetSharePlainArgs Empty = new GetSharePlainArgs();

    /**
     * The ID of the Data Share account in which the Data Share is created.
     * 
     */
    @Import(name="accountId", required=true)
    private String accountId;

    /**
     * @return The ID of the Data Share account in which the Data Share is created.
     * 
     */
    public String accountId() {
        return this.accountId;
    }

    /**
     * The name of this Data Share.
     * 
     */
    @Import(name="name", required=true)
    private String name;

    /**
     * @return The name of this Data Share.
     * 
     */
    public String name() {
        return this.name;
    }

    private GetSharePlainArgs() {}

    private GetSharePlainArgs(GetSharePlainArgs $) {
        this.accountId = $.accountId;
        this.name = $.name;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetSharePlainArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetSharePlainArgs $;

        public Builder() {
            $ = new GetSharePlainArgs();
        }

        public Builder(GetSharePlainArgs defaults) {
            $ = new GetSharePlainArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param accountId The ID of the Data Share account in which the Data Share is created.
         * 
         * @return builder
         * 
         */
        public Builder accountId(String accountId) {
            $.accountId = accountId;
            return this;
        }

        /**
         * @param name The name of this Data Share.
         * 
         * @return builder
         * 
         */
        public Builder name(String name) {
            $.name = name;
            return this;
        }

        public GetSharePlainArgs build() {
            $.accountId = Objects.requireNonNull($.accountId, "expected parameter 'accountId' to be non-null");
            $.name = Objects.requireNonNull($.name, "expected parameter 'name' to be non-null");
            return $;
        }
    }

}
