// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.desktopvirtualization.inputs;

import io.pulumi.core.internal.annotations.InputImport;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * Properties for arm migration.
 * 
 */
public final class MigrationRequestPropertiesResponse extends io.pulumi.resources.InvokeArgs {

    public static final MigrationRequestPropertiesResponse Empty = new MigrationRequestPropertiesResponse();

    /**
     * The path to the legacy object to migrate.
     * 
     */
    @InputImport(name="migrationPath")
    private final @Nullable String migrationPath;

    public Optional<String> getMigrationPath() {
        return this.migrationPath == null ? Optional.empty() : Optional.ofNullable(this.migrationPath);
    }

    /**
     * The type of operation for migration.
     * 
     */
    @InputImport(name="operation")
    private final @Nullable String operation;

    public Optional<String> getOperation() {
        return this.operation == null ? Optional.empty() : Optional.ofNullable(this.operation);
    }

    public MigrationRequestPropertiesResponse(
        @Nullable String migrationPath,
        @Nullable String operation) {
        this.migrationPath = migrationPath;
        this.operation = operation;
    }

    private MigrationRequestPropertiesResponse() {
        this.migrationPath = null;
        this.operation = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(MigrationRequestPropertiesResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String migrationPath;
        private @Nullable String operation;

        public Builder() {
    	      // Empty
        }

        public Builder(MigrationRequestPropertiesResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.migrationPath = defaults.migrationPath;
    	      this.operation = defaults.operation;
        }

        public Builder setMigrationPath(@Nullable String migrationPath) {
            this.migrationPath = migrationPath;
            return this;
        }

        public Builder setOperation(@Nullable String operation) {
            this.operation = operation;
            return this;
        }

        public MigrationRequestPropertiesResponse build() {
            return new MigrationRequestPropertiesResponse(migrationPath, operation);
        }
    }
}
