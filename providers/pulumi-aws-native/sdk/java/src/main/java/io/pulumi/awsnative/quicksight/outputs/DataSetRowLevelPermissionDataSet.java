// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.quicksight.outputs;

import io.pulumi.awsnative.quicksight.enums.DataSetRowLevelPermissionFormatVersion;
import io.pulumi.awsnative.quicksight.enums.DataSetRowLevelPermissionPolicy;
import io.pulumi.core.internal.annotations.OutputCustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class DataSetRowLevelPermissionDataSet {
    private final String arn;
    private final @Nullable DataSetRowLevelPermissionFormatVersion formatVersion;
    private final @Nullable String namespace;
    private final DataSetRowLevelPermissionPolicy permissionPolicy;

    @OutputCustomType.Constructor({"arn","formatVersion","namespace","permissionPolicy"})
    private DataSetRowLevelPermissionDataSet(
        String arn,
        @Nullable DataSetRowLevelPermissionFormatVersion formatVersion,
        @Nullable String namespace,
        DataSetRowLevelPermissionPolicy permissionPolicy) {
        this.arn = Objects.requireNonNull(arn);
        this.formatVersion = formatVersion;
        this.namespace = namespace;
        this.permissionPolicy = Objects.requireNonNull(permissionPolicy);
    }

    public String getArn() {
        return this.arn;
    }
    public Optional<DataSetRowLevelPermissionFormatVersion> getFormatVersion() {
        return Optional.ofNullable(this.formatVersion);
    }
    public Optional<String> getNamespace() {
        return Optional.ofNullable(this.namespace);
    }
    public DataSetRowLevelPermissionPolicy getPermissionPolicy() {
        return this.permissionPolicy;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(DataSetRowLevelPermissionDataSet defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String arn;
        private @Nullable DataSetRowLevelPermissionFormatVersion formatVersion;
        private @Nullable String namespace;
        private DataSetRowLevelPermissionPolicy permissionPolicy;

        public Builder() {
    	      // Empty
        }

        public Builder(DataSetRowLevelPermissionDataSet defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.arn = defaults.arn;
    	      this.formatVersion = defaults.formatVersion;
    	      this.namespace = defaults.namespace;
    	      this.permissionPolicy = defaults.permissionPolicy;
        }

        public Builder setArn(String arn) {
            this.arn = Objects.requireNonNull(arn);
            return this;
        }

        public Builder setFormatVersion(@Nullable DataSetRowLevelPermissionFormatVersion formatVersion) {
            this.formatVersion = formatVersion;
            return this;
        }

        public Builder setNamespace(@Nullable String namespace) {
            this.namespace = namespace;
            return this;
        }

        public Builder setPermissionPolicy(DataSetRowLevelPermissionPolicy permissionPolicy) {
            this.permissionPolicy = Objects.requireNonNull(permissionPolicy);
            return this;
        }

        public DataSetRowLevelPermissionDataSet build() {
            return new DataSetRowLevelPermissionDataSet(arn, formatVersion, namespace, permissionPolicy);
        }
    }
}
