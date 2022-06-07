// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.media.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


public final class ListMediaServiceKeysPlainArgs extends com.pulumi.resources.InvokeArgs {

    public static final ListMediaServiceKeysPlainArgs Empty = new ListMediaServiceKeysPlainArgs();

    /**
     * Name of the Media Service.
     * 
     */
    @Import(name="mediaServiceName", required=true)
    private String mediaServiceName;

    /**
     * @return Name of the Media Service.
     * 
     */
    public String mediaServiceName() {
        return this.mediaServiceName;
    }

    /**
     * Name of the resource group within the Azure subscription.
     * 
     */
    @Import(name="resourceGroupName", required=true)
    private String resourceGroupName;

    /**
     * @return Name of the resource group within the Azure subscription.
     * 
     */
    public String resourceGroupName() {
        return this.resourceGroupName;
    }

    private ListMediaServiceKeysPlainArgs() {}

    private ListMediaServiceKeysPlainArgs(ListMediaServiceKeysPlainArgs $) {
        this.mediaServiceName = $.mediaServiceName;
        this.resourceGroupName = $.resourceGroupName;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ListMediaServiceKeysPlainArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ListMediaServiceKeysPlainArgs $;

        public Builder() {
            $ = new ListMediaServiceKeysPlainArgs();
        }

        public Builder(ListMediaServiceKeysPlainArgs defaults) {
            $ = new ListMediaServiceKeysPlainArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param mediaServiceName Name of the Media Service.
         * 
         * @return builder
         * 
         */
        public Builder mediaServiceName(String mediaServiceName) {
            $.mediaServiceName = mediaServiceName;
            return this;
        }

        /**
         * @param resourceGroupName Name of the resource group within the Azure subscription.
         * 
         * @return builder
         * 
         */
        public Builder resourceGroupName(String resourceGroupName) {
            $.resourceGroupName = resourceGroupName;
            return this;
        }

        public ListMediaServiceKeysPlainArgs build() {
            $.mediaServiceName = Objects.requireNonNull($.mediaServiceName, "expected parameter 'mediaServiceName' to be non-null");
            $.resourceGroupName = Objects.requireNonNull($.resourceGroupName, "expected parameter 'resourceGroupName' to be non-null");
            return $;
        }
    }

}
