// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.sqladmin_v1beta4.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * SQL Server specific audit configuration.
 * 
 */
public final class SqlServerAuditConfigArgs extends io.pulumi.resources.ResourceArgs {

    public static final SqlServerAuditConfigArgs Empty = new SqlServerAuditConfigArgs();

    /**
     * The name of the destination bucket (e.g., gs://mybucket).
     * 
     */
    @InputImport(name="bucket")
      private final @Nullable Input<String> bucket;

    public Input<String> getBucket() {
        return this.bucket == null ? Input.empty() : this.bucket;
    }

    /**
     * This is always sql#sqlServerAuditConfig
     * 
     */
    @InputImport(name="kind")
      private final @Nullable Input<String> kind;

    public Input<String> getKind() {
        return this.kind == null ? Input.empty() : this.kind;
    }

    public SqlServerAuditConfigArgs(
        @Nullable Input<String> bucket,
        @Nullable Input<String> kind) {
        this.bucket = bucket;
        this.kind = kind;
    }

    private SqlServerAuditConfigArgs() {
        this.bucket = Input.empty();
        this.kind = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(SqlServerAuditConfigArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<String> bucket;
        private @Nullable Input<String> kind;

        public Builder() {
    	      // Empty
        }

        public Builder(SqlServerAuditConfigArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.bucket = defaults.bucket;
    	      this.kind = defaults.kind;
        }

        public Builder setBucket(@Nullable Input<String> bucket) {
            this.bucket = bucket;
            return this;
        }

        public Builder setBucket(@Nullable String bucket) {
            this.bucket = Input.ofNullable(bucket);
            return this;
        }

        public Builder setKind(@Nullable Input<String> kind) {
            this.kind = kind;
            return this;
        }

        public Builder setKind(@Nullable String kind) {
            this.kind = Input.ofNullable(kind);
            return this;
        }
        public SqlServerAuditConfigArgs build() {
            return new SqlServerAuditConfigArgs(bucket, kind);
        }
    }
}