// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.cassandra.outputs;

import io.pulumi.awsnative.cassandra.outputs.TableBillingMode;
import io.pulumi.awsnative.cassandra.outputs.TableColumn;
import io.pulumi.awsnative.cassandra.outputs.TableEncryptionSpecification;
import io.pulumi.awsnative.cassandra.outputs.TableTag;
import io.pulumi.core.annotations.CustomType;
import java.lang.Boolean;
import java.lang.Integer;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class GetTableResult {
    private final @Nullable TableBillingMode billingMode;
    /**
     * Default TTL (Time To Live) in seconds, where zero is disabled. If the value is greater than zero, TTL is enabled for the entire table and an expiration timestamp is added to each column.
     * 
     */
    private final @Nullable Integer defaultTimeToLive;
    private final @Nullable TableEncryptionSpecification encryptionSpecification;
    /**
     * Indicates whether point in time recovery is enabled (true) or disabled (false) on the table
     * 
     */
    private final @Nullable Boolean pointInTimeRecoveryEnabled;
    /**
     * Non-key columns of the table
     * 
     */
    private final @Nullable List<TableColumn> regularColumns;
    /**
     * An array of key-value pairs to apply to this resource
     * 
     */
    private final @Nullable List<TableTag> tags;

    @CustomType.Constructor
    private GetTableResult(
        @CustomType.Parameter("billingMode") @Nullable TableBillingMode billingMode,
        @CustomType.Parameter("defaultTimeToLive") @Nullable Integer defaultTimeToLive,
        @CustomType.Parameter("encryptionSpecification") @Nullable TableEncryptionSpecification encryptionSpecification,
        @CustomType.Parameter("pointInTimeRecoveryEnabled") @Nullable Boolean pointInTimeRecoveryEnabled,
        @CustomType.Parameter("regularColumns") @Nullable List<TableColumn> regularColumns,
        @CustomType.Parameter("tags") @Nullable List<TableTag> tags) {
        this.billingMode = billingMode;
        this.defaultTimeToLive = defaultTimeToLive;
        this.encryptionSpecification = encryptionSpecification;
        this.pointInTimeRecoveryEnabled = pointInTimeRecoveryEnabled;
        this.regularColumns = regularColumns;
        this.tags = tags;
    }

    public Optional<TableBillingMode> getBillingMode() {
        return Optional.ofNullable(this.billingMode);
    }
    /**
     * Default TTL (Time To Live) in seconds, where zero is disabled. If the value is greater than zero, TTL is enabled for the entire table and an expiration timestamp is added to each column.
     * 
    */
    public Optional<Integer> getDefaultTimeToLive() {
        return Optional.ofNullable(this.defaultTimeToLive);
    }
    public Optional<TableEncryptionSpecification> getEncryptionSpecification() {
        return Optional.ofNullable(this.encryptionSpecification);
    }
    /**
     * Indicates whether point in time recovery is enabled (true) or disabled (false) on the table
     * 
    */
    public Optional<Boolean> getPointInTimeRecoveryEnabled() {
        return Optional.ofNullable(this.pointInTimeRecoveryEnabled);
    }
    /**
     * Non-key columns of the table
     * 
    */
    public List<TableColumn> getRegularColumns() {
        return this.regularColumns == null ? List.of() : this.regularColumns;
    }
    /**
     * An array of key-value pairs to apply to this resource
     * 
    */
    public List<TableTag> getTags() {
        return this.tags == null ? List.of() : this.tags;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetTableResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable TableBillingMode billingMode;
        private @Nullable Integer defaultTimeToLive;
        private @Nullable TableEncryptionSpecification encryptionSpecification;
        private @Nullable Boolean pointInTimeRecoveryEnabled;
        private @Nullable List<TableColumn> regularColumns;
        private @Nullable List<TableTag> tags;

        public Builder() {
    	      // Empty
        }

        public Builder(GetTableResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.billingMode = defaults.billingMode;
    	      this.defaultTimeToLive = defaults.defaultTimeToLive;
    	      this.encryptionSpecification = defaults.encryptionSpecification;
    	      this.pointInTimeRecoveryEnabled = defaults.pointInTimeRecoveryEnabled;
    	      this.regularColumns = defaults.regularColumns;
    	      this.tags = defaults.tags;
        }

        public Builder billingMode(@Nullable TableBillingMode billingMode) {
            this.billingMode = billingMode;
            return this;
        }
        public Builder defaultTimeToLive(@Nullable Integer defaultTimeToLive) {
            this.defaultTimeToLive = defaultTimeToLive;
            return this;
        }
        public Builder encryptionSpecification(@Nullable TableEncryptionSpecification encryptionSpecification) {
            this.encryptionSpecification = encryptionSpecification;
            return this;
        }
        public Builder pointInTimeRecoveryEnabled(@Nullable Boolean pointInTimeRecoveryEnabled) {
            this.pointInTimeRecoveryEnabled = pointInTimeRecoveryEnabled;
            return this;
        }
        public Builder regularColumns(@Nullable List<TableColumn> regularColumns) {
            this.regularColumns = regularColumns;
            return this;
        }
        public Builder regularColumns(TableColumn... regularColumns) {
            return regularColumns(List.of(regularColumns));
        }
        public Builder tags(@Nullable List<TableTag> tags) {
            this.tags = tags;
            return this;
        }
        public Builder tags(TableTag... tags) {
            return tags(List.of(tags));
        }        public GetTableResult build() {
            return new GetTableResult(billingMode, defaultTimeToLive, encryptionSpecification, pointInTimeRecoveryEnabled, regularColumns, tags);
        }
    }
}
