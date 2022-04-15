// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.quicksight.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.core.internal.Codegen;
import java.lang.String;
import java.util.Objects;


/**
 * <p>Amazon RDS parameters.</p>
 * 
 */
public final class DataSourceRdsParametersArgs extends io.pulumi.resources.ResourceArgs {

    public static final DataSourceRdsParametersArgs Empty = new DataSourceRdsParametersArgs();

    /**
     * <p>Database.</p>
     * 
     */
    @Import(name="database", required=true)
      private final Output<String> database;

    public Output<String> database() {
        return this.database;
    }

    /**
     * <p>Instance ID.</p>
     * 
     */
    @Import(name="instanceId", required=true)
      private final Output<String> instanceId;

    public Output<String> instanceId() {
        return this.instanceId;
    }

    public DataSourceRdsParametersArgs(
        Output<String> database,
        Output<String> instanceId) {
        this.database = Objects.requireNonNull(database, "expected parameter 'database' to be non-null");
        this.instanceId = Objects.requireNonNull(instanceId, "expected parameter 'instanceId' to be non-null");
    }

    private DataSourceRdsParametersArgs() {
        this.database = Codegen.empty();
        this.instanceId = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(DataSourceRdsParametersArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Output<String> database;
        private Output<String> instanceId;

        public Builder() {
    	      // Empty
        }

        public Builder(DataSourceRdsParametersArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.database = defaults.database;
    	      this.instanceId = defaults.instanceId;
        }

        public Builder database(Output<String> database) {
            this.database = Objects.requireNonNull(database);
            return this;
        }
        public Builder database(String database) {
            this.database = Output.of(Objects.requireNonNull(database));
            return this;
        }
        public Builder instanceId(Output<String> instanceId) {
            this.instanceId = Objects.requireNonNull(instanceId);
            return this;
        }
        public Builder instanceId(String instanceId) {
            this.instanceId = Output.of(Objects.requireNonNull(instanceId));
            return this;
        }        public DataSourceRdsParametersArgs build() {
            return new DataSourceRdsParametersArgs(database, instanceId);
        }
    }
}
