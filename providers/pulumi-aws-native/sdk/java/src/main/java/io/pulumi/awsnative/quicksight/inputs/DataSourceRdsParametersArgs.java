// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.quicksight.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.internal.annotations.InputImport;
import java.lang.String;
import java.util.Objects;


public final class DataSourceRdsParametersArgs extends io.pulumi.resources.ResourceArgs {

    public static final DataSourceRdsParametersArgs Empty = new DataSourceRdsParametersArgs();

    @InputImport(name="database", required=true)
    private final Input<String> database;

    public Input<String> getDatabase() {
        return this.database;
    }

    @InputImport(name="instanceId", required=true)
    private final Input<String> instanceId;

    public Input<String> getInstanceId() {
        return this.instanceId;
    }

    public DataSourceRdsParametersArgs(
        Input<String> database,
        Input<String> instanceId) {
        this.database = Objects.requireNonNull(database, "expected parameter 'database' to be non-null");
        this.instanceId = Objects.requireNonNull(instanceId, "expected parameter 'instanceId' to be non-null");
    }

    private DataSourceRdsParametersArgs() {
        this.database = Input.empty();
        this.instanceId = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(DataSourceRdsParametersArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Input<String> database;
        private Input<String> instanceId;

        public Builder() {
    	      // Empty
        }

        public Builder(DataSourceRdsParametersArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.database = defaults.database;
    	      this.instanceId = defaults.instanceId;
        }

        public Builder setDatabase(Input<String> database) {
            this.database = Objects.requireNonNull(database);
            return this;
        }

        public Builder setDatabase(String database) {
            this.database = Input.of(Objects.requireNonNull(database));
            return this;
        }

        public Builder setInstanceId(Input<String> instanceId) {
            this.instanceId = Objects.requireNonNull(instanceId);
            return this;
        }

        public Builder setInstanceId(String instanceId) {
            this.instanceId = Input.of(Objects.requireNonNull(instanceId));
            return this;
        }

        public DataSourceRdsParametersArgs build() {
            return new DataSourceRdsParametersArgs(database, instanceId);
        }
    }
}
