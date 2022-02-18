// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.datafactory.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.internal.annotations.InputImport;
import java.lang.Object;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * The settings that will be leveraged for SAP HANA source partitioning.
 * 
 */
public final class SapHanaPartitionSettingsArgs extends io.pulumi.resources.ResourceArgs {

    public static final SapHanaPartitionSettingsArgs Empty = new SapHanaPartitionSettingsArgs();

    /**
     * The name of the column that will be used for proceeding range partitioning. Type: string (or Expression with resultType string).
     * 
     */
    @InputImport(name="partitionColumnName")
    private final @Nullable Input<Object> partitionColumnName;

    public Input<Object> getPartitionColumnName() {
        return this.partitionColumnName == null ? Input.empty() : this.partitionColumnName;
    }

    public SapHanaPartitionSettingsArgs(@Nullable Input<Object> partitionColumnName) {
        this.partitionColumnName = partitionColumnName;
    }

    private SapHanaPartitionSettingsArgs() {
        this.partitionColumnName = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(SapHanaPartitionSettingsArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<Object> partitionColumnName;

        public Builder() {
    	      // Empty
        }

        public Builder(SapHanaPartitionSettingsArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.partitionColumnName = defaults.partitionColumnName;
        }

        public Builder setPartitionColumnName(@Nullable Input<Object> partitionColumnName) {
            this.partitionColumnName = partitionColumnName;
            return this;
        }

        public Builder setPartitionColumnName(@Nullable Object partitionColumnName) {
            this.partitionColumnName = Input.ofNullable(partitionColumnName);
            return this;
        }

        public SapHanaPartitionSettingsArgs build() {
            return new SapHanaPartitionSettingsArgs(partitionColumnName);
        }
    }
}
