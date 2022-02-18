// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.ec2.inputs;

import io.pulumi.awsnative.ec2.enums.FlowLogDestinationOptionsPropertiesFileFormat;
import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.Boolean;
import java.util.Objects;


public final class DestinationOptionsPropertiesArgs extends io.pulumi.resources.ResourceArgs {

    public static final DestinationOptionsPropertiesArgs Empty = new DestinationOptionsPropertiesArgs();

    @InputImport(name="fileFormat", required=true)
    private final Input<FlowLogDestinationOptionsPropertiesFileFormat> fileFormat;

    public Input<FlowLogDestinationOptionsPropertiesFileFormat> getFileFormat() {
        return this.fileFormat;
    }

    @InputImport(name="hiveCompatiblePartitions", required=true)
    private final Input<Boolean> hiveCompatiblePartitions;

    public Input<Boolean> getHiveCompatiblePartitions() {
        return this.hiveCompatiblePartitions;
    }

    @InputImport(name="perHourPartition", required=true)
    private final Input<Boolean> perHourPartition;

    public Input<Boolean> getPerHourPartition() {
        return this.perHourPartition;
    }

    public DestinationOptionsPropertiesArgs(
        Input<FlowLogDestinationOptionsPropertiesFileFormat> fileFormat,
        Input<Boolean> hiveCompatiblePartitions,
        Input<Boolean> perHourPartition) {
        this.fileFormat = Objects.requireNonNull(fileFormat, "expected parameter 'fileFormat' to be non-null");
        this.hiveCompatiblePartitions = Objects.requireNonNull(hiveCompatiblePartitions, "expected parameter 'hiveCompatiblePartitions' to be non-null");
        this.perHourPartition = Objects.requireNonNull(perHourPartition, "expected parameter 'perHourPartition' to be non-null");
    }

    private DestinationOptionsPropertiesArgs() {
        this.fileFormat = Input.empty();
        this.hiveCompatiblePartitions = Input.empty();
        this.perHourPartition = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(DestinationOptionsPropertiesArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Input<FlowLogDestinationOptionsPropertiesFileFormat> fileFormat;
        private Input<Boolean> hiveCompatiblePartitions;
        private Input<Boolean> perHourPartition;

        public Builder() {
    	      // Empty
        }

        public Builder(DestinationOptionsPropertiesArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.fileFormat = defaults.fileFormat;
    	      this.hiveCompatiblePartitions = defaults.hiveCompatiblePartitions;
    	      this.perHourPartition = defaults.perHourPartition;
        }

        public Builder setFileFormat(Input<FlowLogDestinationOptionsPropertiesFileFormat> fileFormat) {
            this.fileFormat = Objects.requireNonNull(fileFormat);
            return this;
        }

        public Builder setFileFormat(FlowLogDestinationOptionsPropertiesFileFormat fileFormat) {
            this.fileFormat = Input.of(Objects.requireNonNull(fileFormat));
            return this;
        }

        public Builder setHiveCompatiblePartitions(Input<Boolean> hiveCompatiblePartitions) {
            this.hiveCompatiblePartitions = Objects.requireNonNull(hiveCompatiblePartitions);
            return this;
        }

        public Builder setHiveCompatiblePartitions(Boolean hiveCompatiblePartitions) {
            this.hiveCompatiblePartitions = Input.of(Objects.requireNonNull(hiveCompatiblePartitions));
            return this;
        }

        public Builder setPerHourPartition(Input<Boolean> perHourPartition) {
            this.perHourPartition = Objects.requireNonNull(perHourPartition);
            return this;
        }

        public Builder setPerHourPartition(Boolean perHourPartition) {
            this.perHourPartition = Input.of(Objects.requireNonNull(perHourPartition));
            return this;
        }

        public DestinationOptionsPropertiesArgs build() {
            return new DestinationOptionsPropertiesArgs(fileFormat, hiveCompatiblePartitions, perHourPartition);
        }
    }
}
