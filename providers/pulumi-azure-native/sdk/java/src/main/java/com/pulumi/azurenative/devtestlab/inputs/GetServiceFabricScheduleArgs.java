// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.devtestlab.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetServiceFabricScheduleArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetServiceFabricScheduleArgs Empty = new GetServiceFabricScheduleArgs();

    /**
     * Specify the $expand query. Example: &#39;properties($select=status)&#39;
     * 
     */
    @Import(name="expand")
    private @Nullable Output<String> expand;

    /**
     * @return Specify the $expand query. Example: &#39;properties($select=status)&#39;
     * 
     */
    public Optional<Output<String>> expand() {
        return Optional.ofNullable(this.expand);
    }

    /**
     * The name of the lab.
     * 
     */
    @Import(name="labName", required=true)
    private Output<String> labName;

    /**
     * @return The name of the lab.
     * 
     */
    public Output<String> labName() {
        return this.labName;
    }

    /**
     * The name of the schedule.
     * 
     */
    @Import(name="name", required=true)
    private Output<String> name;

    /**
     * @return The name of the schedule.
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

    /**
     * The name of the service fabric.
     * 
     */
    @Import(name="serviceFabricName", required=true)
    private Output<String> serviceFabricName;

    /**
     * @return The name of the service fabric.
     * 
     */
    public Output<String> serviceFabricName() {
        return this.serviceFabricName;
    }

    /**
     * The name of the user profile.
     * 
     */
    @Import(name="userName", required=true)
    private Output<String> userName;

    /**
     * @return The name of the user profile.
     * 
     */
    public Output<String> userName() {
        return this.userName;
    }

    private GetServiceFabricScheduleArgs() {}

    private GetServiceFabricScheduleArgs(GetServiceFabricScheduleArgs $) {
        this.expand = $.expand;
        this.labName = $.labName;
        this.name = $.name;
        this.resourceGroupName = $.resourceGroupName;
        this.serviceFabricName = $.serviceFabricName;
        this.userName = $.userName;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetServiceFabricScheduleArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetServiceFabricScheduleArgs $;

        public Builder() {
            $ = new GetServiceFabricScheduleArgs();
        }

        public Builder(GetServiceFabricScheduleArgs defaults) {
            $ = new GetServiceFabricScheduleArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param expand Specify the $expand query. Example: &#39;properties($select=status)&#39;
         * 
         * @return builder
         * 
         */
        public Builder expand(@Nullable Output<String> expand) {
            $.expand = expand;
            return this;
        }

        /**
         * @param expand Specify the $expand query. Example: &#39;properties($select=status)&#39;
         * 
         * @return builder
         * 
         */
        public Builder expand(String expand) {
            return expand(Output.of(expand));
        }

        /**
         * @param labName The name of the lab.
         * 
         * @return builder
         * 
         */
        public Builder labName(Output<String> labName) {
            $.labName = labName;
            return this;
        }

        /**
         * @param labName The name of the lab.
         * 
         * @return builder
         * 
         */
        public Builder labName(String labName) {
            return labName(Output.of(labName));
        }

        /**
         * @param name The name of the schedule.
         * 
         * @return builder
         * 
         */
        public Builder name(Output<String> name) {
            $.name = name;
            return this;
        }

        /**
         * @param name The name of the schedule.
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

        /**
         * @param serviceFabricName The name of the service fabric.
         * 
         * @return builder
         * 
         */
        public Builder serviceFabricName(Output<String> serviceFabricName) {
            $.serviceFabricName = serviceFabricName;
            return this;
        }

        /**
         * @param serviceFabricName The name of the service fabric.
         * 
         * @return builder
         * 
         */
        public Builder serviceFabricName(String serviceFabricName) {
            return serviceFabricName(Output.of(serviceFabricName));
        }

        /**
         * @param userName The name of the user profile.
         * 
         * @return builder
         * 
         */
        public Builder userName(Output<String> userName) {
            $.userName = userName;
            return this;
        }

        /**
         * @param userName The name of the user profile.
         * 
         * @return builder
         * 
         */
        public Builder userName(String userName) {
            return userName(Output.of(userName));
        }

        public GetServiceFabricScheduleArgs build() {
            $.labName = Objects.requireNonNull($.labName, "expected parameter 'labName' to be non-null");
            $.name = Objects.requireNonNull($.name, "expected parameter 'name' to be non-null");
            $.resourceGroupName = Objects.requireNonNull($.resourceGroupName, "expected parameter 'resourceGroupName' to be non-null");
            $.serviceFabricName = Objects.requireNonNull($.serviceFabricName, "expected parameter 'serviceFabricName' to be non-null");
            $.userName = Objects.requireNonNull($.userName, "expected parameter 'userName' to be non-null");
            return $;
        }
    }

}
