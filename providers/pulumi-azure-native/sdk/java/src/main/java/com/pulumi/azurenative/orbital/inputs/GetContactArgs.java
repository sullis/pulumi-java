// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.orbital.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


public final class GetContactArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetContactArgs Empty = new GetContactArgs();

    /**
     * Contact Name
     * 
     */
    @Import(name="contactName", required=true)
    private String contactName;

    /**
     * @return Contact Name
     * 
     */
    public String contactName() {
        return this.contactName;
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

    /**
     * Spacecraft ID
     * 
     */
    @Import(name="spacecraftName", required=true)
    private String spacecraftName;

    /**
     * @return Spacecraft ID
     * 
     */
    public String spacecraftName() {
        return this.spacecraftName;
    }

    private GetContactArgs() {}

    private GetContactArgs(GetContactArgs $) {
        this.contactName = $.contactName;
        this.resourceGroupName = $.resourceGroupName;
        this.spacecraftName = $.spacecraftName;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetContactArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetContactArgs $;

        public Builder() {
            $ = new GetContactArgs();
        }

        public Builder(GetContactArgs defaults) {
            $ = new GetContactArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param contactName Contact Name
         * 
         * @return builder
         * 
         */
        public Builder contactName(String contactName) {
            $.contactName = contactName;
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

        /**
         * @param spacecraftName Spacecraft ID
         * 
         * @return builder
         * 
         */
        public Builder spacecraftName(String spacecraftName) {
            $.spacecraftName = spacecraftName;
            return this;
        }

        public GetContactArgs build() {
            $.contactName = Objects.requireNonNull($.contactName, "expected parameter 'contactName' to be non-null");
            $.resourceGroupName = Objects.requireNonNull($.resourceGroupName, "expected parameter 'resourceGroupName' to be non-null");
            $.spacecraftName = Objects.requireNonNull($.spacecraftName, "expected parameter 'spacecraftName' to be non-null");
            return $;
        }
    }

}
