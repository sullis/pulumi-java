// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.labservices.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


public final class GetSchedulePlainArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetSchedulePlainArgs Empty = new GetSchedulePlainArgs();

    /**
     * The name of the lab that uniquely identifies it within containing lab account. Used in resource URIs.
     * 
     */
    @Import(name="labName", required=true)
    private String labName;

    /**
     * @return The name of the lab that uniquely identifies it within containing lab account. Used in resource URIs.
     * 
     */
    public String labName() {
        return this.labName;
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
     * The name of the schedule that uniquely identifies it within containing lab. Used in resource URIs.
     * 
     */
    @Import(name="scheduleName", required=true)
    private String scheduleName;

    /**
     * @return The name of the schedule that uniquely identifies it within containing lab. Used in resource URIs.
     * 
     */
    public String scheduleName() {
        return this.scheduleName;
    }

    private GetSchedulePlainArgs() {}

    private GetSchedulePlainArgs(GetSchedulePlainArgs $) {
        this.labName = $.labName;
        this.resourceGroupName = $.resourceGroupName;
        this.scheduleName = $.scheduleName;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetSchedulePlainArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetSchedulePlainArgs $;

        public Builder() {
            $ = new GetSchedulePlainArgs();
        }

        public Builder(GetSchedulePlainArgs defaults) {
            $ = new GetSchedulePlainArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param labName The name of the lab that uniquely identifies it within containing lab account. Used in resource URIs.
         * 
         * @return builder
         * 
         */
        public Builder labName(String labName) {
            $.labName = labName;
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
         * @param scheduleName The name of the schedule that uniquely identifies it within containing lab. Used in resource URIs.
         * 
         * @return builder
         * 
         */
        public Builder scheduleName(String scheduleName) {
            $.scheduleName = scheduleName;
            return this;
        }

        public GetSchedulePlainArgs build() {
            $.labName = Objects.requireNonNull($.labName, "expected parameter 'labName' to be non-null");
            $.resourceGroupName = Objects.requireNonNull($.resourceGroupName, "expected parameter 'resourceGroupName' to be non-null");
            $.scheduleName = Objects.requireNonNull($.scheduleName, "expected parameter 'scheduleName' to be non-null");
            return $;
        }
    }

}
