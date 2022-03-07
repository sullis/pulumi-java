// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.composer_v1.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * The configuration of Cloud SQL instance that is used by the Apache Airflow software. Supported for Cloud Composer environments in versions composer-1.*.*-airflow-*.*.*.
 * 
 */
public final class DatabaseConfigArgs extends io.pulumi.resources.ResourceArgs {

    public static final DatabaseConfigArgs Empty = new DatabaseConfigArgs();

    /**
     * Optional. Cloud SQL machine type used by Airflow database. It has to be one of: db-n1-standard-2, db-n1-standard-4, db-n1-standard-8 or db-n1-standard-16. If not specified, db-n1-standard-2 will be used.
     * 
     */
    @InputImport(name="machineType")
      private final @Nullable Input<String> machineType;

    public Input<String> getMachineType() {
        return this.machineType == null ? Input.empty() : this.machineType;
    }

    public DatabaseConfigArgs(@Nullable Input<String> machineType) {
        this.machineType = machineType;
    }

    private DatabaseConfigArgs() {
        this.machineType = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(DatabaseConfigArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<String> machineType;

        public Builder() {
    	      // Empty
        }

        public Builder(DatabaseConfigArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.machineType = defaults.machineType;
        }

        public Builder setMachineType(@Nullable Input<String> machineType) {
            this.machineType = machineType;
            return this;
        }

        public Builder setMachineType(@Nullable String machineType) {
            this.machineType = Input.ofNullable(machineType);
            return this;
        }
        public DatabaseConfigArgs build() {
            return new DatabaseConfigArgs(machineType);
        }
    }
}