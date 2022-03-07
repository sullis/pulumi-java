// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.rds;

import io.pulumi.awsnative.rds.enums.GlobalClusterEngine;
import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class GlobalClusterArgs extends io.pulumi.resources.ResourceArgs {

    public static final GlobalClusterArgs Empty = new GlobalClusterArgs();

    /**
     * The deletion protection setting for the new global database. The global database can't be deleted when deletion protection is enabled.
     * 
     */
    @InputImport(name="deletionProtection")
      private final @Nullable Input<Boolean> deletionProtection;

    public Input<Boolean> getDeletionProtection() {
        return this.deletionProtection == null ? Input.empty() : this.deletionProtection;
    }

    /**
     * The name of the database engine to be used for this DB cluster. Valid Values: aurora (for MySQL 5.6-compatible Aurora), aurora-mysql (for MySQL 5.7-compatible Aurora).
     * If you specify the SourceDBClusterIdentifier property, don't specify this property. The value is inherited from the cluster.
     * 
     */
    @InputImport(name="engine")
      private final @Nullable Input<GlobalClusterEngine> engine;

    public Input<GlobalClusterEngine> getEngine() {
        return this.engine == null ? Input.empty() : this.engine;
    }

    /**
     * The version number of the database engine to use. If you specify the SourceDBClusterIdentifier property, don't specify this property. The value is inherited from the cluster.
     * 
     */
    @InputImport(name="engineVersion")
      private final @Nullable Input<String> engineVersion;

    public Input<String> getEngineVersion() {
        return this.engineVersion == null ? Input.empty() : this.engineVersion;
    }

    /**
     * The cluster identifier of the new global database cluster. This parameter is stored as a lowercase string.
     * 
     */
    @InputImport(name="globalClusterIdentifier")
      private final @Nullable Input<String> globalClusterIdentifier;

    public Input<String> getGlobalClusterIdentifier() {
        return this.globalClusterIdentifier == null ? Input.empty() : this.globalClusterIdentifier;
    }

    /**
     * The Amazon Resource Name (ARN) to use as the primary cluster of the global database. This parameter is optional. This parameter is stored as a lowercase string.
     * 
     */
    @InputImport(name="sourceDBClusterIdentifier")
      private final @Nullable Input<String> sourceDBClusterIdentifier;

    public Input<String> getSourceDBClusterIdentifier() {
        return this.sourceDBClusterIdentifier == null ? Input.empty() : this.sourceDBClusterIdentifier;
    }

    /**
     *  The storage encryption setting for the new global database cluster.
     * If you specify the SourceDBClusterIdentifier property, don't specify this property. The value is inherited from the cluster.
     * 
     */
    @InputImport(name="storageEncrypted")
      private final @Nullable Input<Boolean> storageEncrypted;

    public Input<Boolean> getStorageEncrypted() {
        return this.storageEncrypted == null ? Input.empty() : this.storageEncrypted;
    }

    public GlobalClusterArgs(
        @Nullable Input<Boolean> deletionProtection,
        @Nullable Input<GlobalClusterEngine> engine,
        @Nullable Input<String> engineVersion,
        @Nullable Input<String> globalClusterIdentifier,
        @Nullable Input<String> sourceDBClusterIdentifier,
        @Nullable Input<Boolean> storageEncrypted) {
        this.deletionProtection = deletionProtection;
        this.engine = engine;
        this.engineVersion = engineVersion;
        this.globalClusterIdentifier = globalClusterIdentifier;
        this.sourceDBClusterIdentifier = sourceDBClusterIdentifier;
        this.storageEncrypted = storageEncrypted;
    }

    private GlobalClusterArgs() {
        this.deletionProtection = Input.empty();
        this.engine = Input.empty();
        this.engineVersion = Input.empty();
        this.globalClusterIdentifier = Input.empty();
        this.sourceDBClusterIdentifier = Input.empty();
        this.storageEncrypted = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GlobalClusterArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<Boolean> deletionProtection;
        private @Nullable Input<GlobalClusterEngine> engine;
        private @Nullable Input<String> engineVersion;
        private @Nullable Input<String> globalClusterIdentifier;
        private @Nullable Input<String> sourceDBClusterIdentifier;
        private @Nullable Input<Boolean> storageEncrypted;

        public Builder() {
    	      // Empty
        }

        public Builder(GlobalClusterArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.deletionProtection = defaults.deletionProtection;
    	      this.engine = defaults.engine;
    	      this.engineVersion = defaults.engineVersion;
    	      this.globalClusterIdentifier = defaults.globalClusterIdentifier;
    	      this.sourceDBClusterIdentifier = defaults.sourceDBClusterIdentifier;
    	      this.storageEncrypted = defaults.storageEncrypted;
        }

        public Builder setDeletionProtection(@Nullable Input<Boolean> deletionProtection) {
            this.deletionProtection = deletionProtection;
            return this;
        }

        public Builder setDeletionProtection(@Nullable Boolean deletionProtection) {
            this.deletionProtection = Input.ofNullable(deletionProtection);
            return this;
        }

        public Builder setEngine(@Nullable Input<GlobalClusterEngine> engine) {
            this.engine = engine;
            return this;
        }

        public Builder setEngine(@Nullable GlobalClusterEngine engine) {
            this.engine = Input.ofNullable(engine);
            return this;
        }

        public Builder setEngineVersion(@Nullable Input<String> engineVersion) {
            this.engineVersion = engineVersion;
            return this;
        }

        public Builder setEngineVersion(@Nullable String engineVersion) {
            this.engineVersion = Input.ofNullable(engineVersion);
            return this;
        }

        public Builder setGlobalClusterIdentifier(@Nullable Input<String> globalClusterIdentifier) {
            this.globalClusterIdentifier = globalClusterIdentifier;
            return this;
        }

        public Builder setGlobalClusterIdentifier(@Nullable String globalClusterIdentifier) {
            this.globalClusterIdentifier = Input.ofNullable(globalClusterIdentifier);
            return this;
        }

        public Builder setSourceDBClusterIdentifier(@Nullable Input<String> sourceDBClusterIdentifier) {
            this.sourceDBClusterIdentifier = sourceDBClusterIdentifier;
            return this;
        }

        public Builder setSourceDBClusterIdentifier(@Nullable String sourceDBClusterIdentifier) {
            this.sourceDBClusterIdentifier = Input.ofNullable(sourceDBClusterIdentifier);
            return this;
        }

        public Builder setStorageEncrypted(@Nullable Input<Boolean> storageEncrypted) {
            this.storageEncrypted = storageEncrypted;
            return this;
        }

        public Builder setStorageEncrypted(@Nullable Boolean storageEncrypted) {
            this.storageEncrypted = Input.ofNullable(storageEncrypted);
            return this;
        }
        public GlobalClusterArgs build() {
            return new GlobalClusterArgs(deletionProtection, engine, engineVersion, globalClusterIdentifier, sourceDBClusterIdentifier, storageEncrypted);
        }
    }
}