// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.cache.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


public final class GetLinkedServerArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetLinkedServerArgs Empty = new GetLinkedServerArgs();

    /**
     * The name of the linked server.
     * 
     */
    @Import(name="linkedServerName", required=true)
    private Output<String> linkedServerName;

    /**
     * @return The name of the linked server.
     * 
     */
    public Output<String> linkedServerName() {
        return this.linkedServerName;
    }

    /**
     * The name of the redis cache.
     * 
     */
    @Import(name="name", required=true)
    private Output<String> name;

    /**
     * @return The name of the redis cache.
     * 
     */
    public Output<String> name() {
        return this.name;
    }

    /**
     * The name of the resource group.
     * 
     */
    @Import(name="resourceGroupName", required=true)
    private Output<String> resourceGroupName;

    /**
     * @return The name of the resource group.
     * 
     */
    public Output<String> resourceGroupName() {
        return this.resourceGroupName;
    }

    private GetLinkedServerArgs() {}

    private GetLinkedServerArgs(GetLinkedServerArgs $) {
        this.linkedServerName = $.linkedServerName;
        this.name = $.name;
        this.resourceGroupName = $.resourceGroupName;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetLinkedServerArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetLinkedServerArgs $;

        public Builder() {
            $ = new GetLinkedServerArgs();
        }

        public Builder(GetLinkedServerArgs defaults) {
            $ = new GetLinkedServerArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param linkedServerName The name of the linked server.
         * 
         * @return builder
         * 
         */
        public Builder linkedServerName(Output<String> linkedServerName) {
            $.linkedServerName = linkedServerName;
            return this;
        }

        /**
         * @param linkedServerName The name of the linked server.
         * 
         * @return builder
         * 
         */
        public Builder linkedServerName(String linkedServerName) {
            return linkedServerName(Output.of(linkedServerName));
        }

        /**
         * @param name The name of the redis cache.
         * 
         * @return builder
         * 
         */
        public Builder name(Output<String> name) {
            $.name = name;
            return this;
        }

        /**
         * @param name The name of the redis cache.
         * 
         * @return builder
         * 
         */
        public Builder name(String name) {
            return name(Output.of(name));
        }

        /**
         * @param resourceGroupName The name of the resource group.
         * 
         * @return builder
         * 
         */
        public Builder resourceGroupName(Output<String> resourceGroupName) {
            $.resourceGroupName = resourceGroupName;
            return this;
        }

        /**
         * @param resourceGroupName The name of the resource group.
         * 
         * @return builder
         * 
         */
        public Builder resourceGroupName(String resourceGroupName) {
            return resourceGroupName(Output.of(resourceGroupName));
        }

        public GetLinkedServerArgs build() {
            $.linkedServerName = Objects.requireNonNull($.linkedServerName, "expected parameter 'linkedServerName' to be non-null");
            $.name = Objects.requireNonNull($.name, "expected parameter 'name' to be non-null");
            $.resourceGroupName = Objects.requireNonNull($.resourceGroupName, "expected parameter 'resourceGroupName' to be non-null");
            return $;
        }
    }

}
