// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.maps.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


public final class GetCreatorPlainArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetCreatorPlainArgs Empty = new GetCreatorPlainArgs();

    /**
     * The name of the Maps Account.
     * 
     */
    @Import(name="accountName", required=true)
    private String accountName;

    /**
     * @return The name of the Maps Account.
     * 
     */
    public String accountName() {
        return this.accountName;
    }

    /**
     * The name of the Maps Creator instance.
     * 
     */
    @Import(name="creatorName", required=true)
    private String creatorName;

    /**
     * @return The name of the Maps Creator instance.
     * 
     */
    public String creatorName() {
        return this.creatorName;
    }

    /**
     * The name of the resource group. The name is case insensitive.
     * 
     */
    @Import(name="resourceGroupName", required=true)
    private String resourceGroupName;

    /**
     * @return The name of the resource group. The name is case insensitive.
     * 
     */
    public String resourceGroupName() {
        return this.resourceGroupName;
    }

    private GetCreatorPlainArgs() {}

    private GetCreatorPlainArgs(GetCreatorPlainArgs $) {
        this.accountName = $.accountName;
        this.creatorName = $.creatorName;
        this.resourceGroupName = $.resourceGroupName;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetCreatorPlainArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetCreatorPlainArgs $;

        public Builder() {
            $ = new GetCreatorPlainArgs();
        }

        public Builder(GetCreatorPlainArgs defaults) {
            $ = new GetCreatorPlainArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param accountName The name of the Maps Account.
         * 
         * @return builder
         * 
         */
        public Builder accountName(String accountName) {
            $.accountName = accountName;
            return this;
        }

        /**
         * @param creatorName The name of the Maps Creator instance.
         * 
         * @return builder
         * 
         */
        public Builder creatorName(String creatorName) {
            $.creatorName = creatorName;
            return this;
        }

        /**
         * @param resourceGroupName The name of the resource group. The name is case insensitive.
         * 
         * @return builder
         * 
         */
        public Builder resourceGroupName(String resourceGroupName) {
            $.resourceGroupName = resourceGroupName;
            return this;
        }

        public GetCreatorPlainArgs build() {
            $.accountName = Objects.requireNonNull($.accountName, "expected parameter 'accountName' to be non-null");
            $.creatorName = Objects.requireNonNull($.creatorName, "expected parameter 'creatorName' to be non-null");
            $.resourceGroupName = Objects.requireNonNull($.resourceGroupName, "expected parameter 'resourceGroupName' to be non-null");
            return $;
        }
    }

}
