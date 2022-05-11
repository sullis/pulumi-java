// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azure.loganalytics.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class DataSourceWindowsPerformanceCounterState extends com.pulumi.resources.ResourceArgs {

    public static final DataSourceWindowsPerformanceCounterState Empty = new DataSourceWindowsPerformanceCounterState();

    /**
     * The friendly name of the performance counter.
     * 
     */
    @Import(name="counterName")
    private @Nullable Output<String> counterName;

    /**
     * @return The friendly name of the performance counter.
     * 
     */
    public Optional<Output<String>> counterName() {
        return Optional.ofNullable(this.counterName);
    }

    /**
     * The name of the virtual machine instance to which the Windows Performance Counter DataSource be applied. Specify a `*` will apply to all instances.
     * 
     */
    @Import(name="instanceName")
    private @Nullable Output<String> instanceName;

    /**
     * @return The name of the virtual machine instance to which the Windows Performance Counter DataSource be applied. Specify a `*` will apply to all instances.
     * 
     */
    public Optional<Output<String>> instanceName() {
        return Optional.ofNullable(this.instanceName);
    }

    /**
     * The time of sample interval in seconds. Supports values between 10 and 2147483647.
     * 
     */
    @Import(name="intervalSeconds")
    private @Nullable Output<Integer> intervalSeconds;

    /**
     * @return The time of sample interval in seconds. Supports values between 10 and 2147483647.
     * 
     */
    public Optional<Output<Integer>> intervalSeconds() {
        return Optional.ofNullable(this.intervalSeconds);
    }

    /**
     * The Name which should be used for this Log Analytics Windows Performance Counter DataSource. Changing this forces a new Log Analytics Windows Performance Counter DataSource to be created.
     * 
     */
    @Import(name="name")
    private @Nullable Output<String> name;

    /**
     * @return The Name which should be used for this Log Analytics Windows Performance Counter DataSource. Changing this forces a new Log Analytics Windows Performance Counter DataSource to be created.
     * 
     */
    public Optional<Output<String>> name() {
        return Optional.ofNullable(this.name);
    }

    /**
     * The object name of the Log Analytics Windows Performance Counter DataSource.
     * 
     */
    @Import(name="objectName")
    private @Nullable Output<String> objectName;

    /**
     * @return The object name of the Log Analytics Windows Performance Counter DataSource.
     * 
     */
    public Optional<Output<String>> objectName() {
        return Optional.ofNullable(this.objectName);
    }

    /**
     * The name of the Resource Group where the Log Analytics Windows Performance Counter DataSource should exist. Changing this forces a new Log Analytics Windows Performance Counter DataSource to be created.
     * 
     */
    @Import(name="resourceGroupName")
    private @Nullable Output<String> resourceGroupName;

    /**
     * @return The name of the Resource Group where the Log Analytics Windows Performance Counter DataSource should exist. Changing this forces a new Log Analytics Windows Performance Counter DataSource to be created.
     * 
     */
    public Optional<Output<String>> resourceGroupName() {
        return Optional.ofNullable(this.resourceGroupName);
    }

    /**
     * The name of the Log Analytics Workspace where the Log Analytics Windows Performance Counter DataSource should exist. Changing this forces a new Log Analytics Windows Performance Counter DataSource to be created.
     * 
     */
    @Import(name="workspaceName")
    private @Nullable Output<String> workspaceName;

    /**
     * @return The name of the Log Analytics Workspace where the Log Analytics Windows Performance Counter DataSource should exist. Changing this forces a new Log Analytics Windows Performance Counter DataSource to be created.
     * 
     */
    public Optional<Output<String>> workspaceName() {
        return Optional.ofNullable(this.workspaceName);
    }

    private DataSourceWindowsPerformanceCounterState() {}

    private DataSourceWindowsPerformanceCounterState(DataSourceWindowsPerformanceCounterState $) {
        this.counterName = $.counterName;
        this.instanceName = $.instanceName;
        this.intervalSeconds = $.intervalSeconds;
        this.name = $.name;
        this.objectName = $.objectName;
        this.resourceGroupName = $.resourceGroupName;
        this.workspaceName = $.workspaceName;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(DataSourceWindowsPerformanceCounterState defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private DataSourceWindowsPerformanceCounterState $;

        public Builder() {
            $ = new DataSourceWindowsPerformanceCounterState();
        }

        public Builder(DataSourceWindowsPerformanceCounterState defaults) {
            $ = new DataSourceWindowsPerformanceCounterState(Objects.requireNonNull(defaults));
        }

        /**
         * @param counterName The friendly name of the performance counter.
         * 
         * @return builder
         * 
         */
        public Builder counterName(@Nullable Output<String> counterName) {
            $.counterName = counterName;
            return this;
        }

        /**
         * @param counterName The friendly name of the performance counter.
         * 
         * @return builder
         * 
         */
        public Builder counterName(String counterName) {
            return counterName(Output.of(counterName));
        }

        /**
         * @param instanceName The name of the virtual machine instance to which the Windows Performance Counter DataSource be applied. Specify a `*` will apply to all instances.
         * 
         * @return builder
         * 
         */
        public Builder instanceName(@Nullable Output<String> instanceName) {
            $.instanceName = instanceName;
            return this;
        }

        /**
         * @param instanceName The name of the virtual machine instance to which the Windows Performance Counter DataSource be applied. Specify a `*` will apply to all instances.
         * 
         * @return builder
         * 
         */
        public Builder instanceName(String instanceName) {
            return instanceName(Output.of(instanceName));
        }

        /**
         * @param intervalSeconds The time of sample interval in seconds. Supports values between 10 and 2147483647.
         * 
         * @return builder
         * 
         */
        public Builder intervalSeconds(@Nullable Output<Integer> intervalSeconds) {
            $.intervalSeconds = intervalSeconds;
            return this;
        }

        /**
         * @param intervalSeconds The time of sample interval in seconds. Supports values between 10 and 2147483647.
         * 
         * @return builder
         * 
         */
        public Builder intervalSeconds(Integer intervalSeconds) {
            return intervalSeconds(Output.of(intervalSeconds));
        }

        /**
         * @param name The Name which should be used for this Log Analytics Windows Performance Counter DataSource. Changing this forces a new Log Analytics Windows Performance Counter DataSource to be created.
         * 
         * @return builder
         * 
         */
        public Builder name(@Nullable Output<String> name) {
            $.name = name;
            return this;
        }

        /**
         * @param name The Name which should be used for this Log Analytics Windows Performance Counter DataSource. Changing this forces a new Log Analytics Windows Performance Counter DataSource to be created.
         * 
         * @return builder
         * 
         */
        public Builder name(String name) {
            return name(Output.of(name));
        }

        /**
         * @param objectName The object name of the Log Analytics Windows Performance Counter DataSource.
         * 
         * @return builder
         * 
         */
        public Builder objectName(@Nullable Output<String> objectName) {
            $.objectName = objectName;
            return this;
        }

        /**
         * @param objectName The object name of the Log Analytics Windows Performance Counter DataSource.
         * 
         * @return builder
         * 
         */
        public Builder objectName(String objectName) {
            return objectName(Output.of(objectName));
        }

        /**
         * @param resourceGroupName The name of the Resource Group where the Log Analytics Windows Performance Counter DataSource should exist. Changing this forces a new Log Analytics Windows Performance Counter DataSource to be created.
         * 
         * @return builder
         * 
         */
        public Builder resourceGroupName(@Nullable Output<String> resourceGroupName) {
            $.resourceGroupName = resourceGroupName;
            return this;
        }

        /**
         * @param resourceGroupName The name of the Resource Group where the Log Analytics Windows Performance Counter DataSource should exist. Changing this forces a new Log Analytics Windows Performance Counter DataSource to be created.
         * 
         * @return builder
         * 
         */
        public Builder resourceGroupName(String resourceGroupName) {
            return resourceGroupName(Output.of(resourceGroupName));
        }

        /**
         * @param workspaceName The name of the Log Analytics Workspace where the Log Analytics Windows Performance Counter DataSource should exist. Changing this forces a new Log Analytics Windows Performance Counter DataSource to be created.
         * 
         * @return builder
         * 
         */
        public Builder workspaceName(@Nullable Output<String> workspaceName) {
            $.workspaceName = workspaceName;
            return this;
        }

        /**
         * @param workspaceName The name of the Log Analytics Workspace where the Log Analytics Windows Performance Counter DataSource should exist. Changing this forces a new Log Analytics Windows Performance Counter DataSource to be created.
         * 
         * @return builder
         * 
         */
        public Builder workspaceName(String workspaceName) {
            return workspaceName(Output.of(workspaceName));
        }

        public DataSourceWindowsPerformanceCounterState build() {
            return $;
        }
    }

}
