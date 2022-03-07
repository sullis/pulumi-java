// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.datastream_v1.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import io.pulumi.googlenative.datastream_v1.inputs.MysqlRdbmsArgs;
import io.pulumi.googlenative.datastream_v1.inputs.OracleRdbmsArgs;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * Backfill strategy to automatically backfill the Stream's objects. Specific objects can be excluded.
 * 
 */
public final class BackfillAllStrategyArgs extends io.pulumi.resources.ResourceArgs {

    public static final BackfillAllStrategyArgs Empty = new BackfillAllStrategyArgs();

    /**
     * MySQL data source objects to avoid backfilling.
     * 
     */
    @InputImport(name="mysqlExcludedObjects")
      private final @Nullable Input<MysqlRdbmsArgs> mysqlExcludedObjects;

    public Input<MysqlRdbmsArgs> getMysqlExcludedObjects() {
        return this.mysqlExcludedObjects == null ? Input.empty() : this.mysqlExcludedObjects;
    }

    /**
     * Oracle data source objects to avoid backfilling.
     * 
     */
    @InputImport(name="oracleExcludedObjects")
      private final @Nullable Input<OracleRdbmsArgs> oracleExcludedObjects;

    public Input<OracleRdbmsArgs> getOracleExcludedObjects() {
        return this.oracleExcludedObjects == null ? Input.empty() : this.oracleExcludedObjects;
    }

    public BackfillAllStrategyArgs(
        @Nullable Input<MysqlRdbmsArgs> mysqlExcludedObjects,
        @Nullable Input<OracleRdbmsArgs> oracleExcludedObjects) {
        this.mysqlExcludedObjects = mysqlExcludedObjects;
        this.oracleExcludedObjects = oracleExcludedObjects;
    }

    private BackfillAllStrategyArgs() {
        this.mysqlExcludedObjects = Input.empty();
        this.oracleExcludedObjects = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(BackfillAllStrategyArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<MysqlRdbmsArgs> mysqlExcludedObjects;
        private @Nullable Input<OracleRdbmsArgs> oracleExcludedObjects;

        public Builder() {
    	      // Empty
        }

        public Builder(BackfillAllStrategyArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.mysqlExcludedObjects = defaults.mysqlExcludedObjects;
    	      this.oracleExcludedObjects = defaults.oracleExcludedObjects;
        }

        public Builder setMysqlExcludedObjects(@Nullable Input<MysqlRdbmsArgs> mysqlExcludedObjects) {
            this.mysqlExcludedObjects = mysqlExcludedObjects;
            return this;
        }

        public Builder setMysqlExcludedObjects(@Nullable MysqlRdbmsArgs mysqlExcludedObjects) {
            this.mysqlExcludedObjects = Input.ofNullable(mysqlExcludedObjects);
            return this;
        }

        public Builder setOracleExcludedObjects(@Nullable Input<OracleRdbmsArgs> oracleExcludedObjects) {
            this.oracleExcludedObjects = oracleExcludedObjects;
            return this;
        }

        public Builder setOracleExcludedObjects(@Nullable OracleRdbmsArgs oracleExcludedObjects) {
            this.oracleExcludedObjects = Input.ofNullable(oracleExcludedObjects);
            return this;
        }
        public BackfillAllStrategyArgs build() {
            return new BackfillAllStrategyArgs(mysqlExcludedObjects, oracleExcludedObjects);
        }
    }
}