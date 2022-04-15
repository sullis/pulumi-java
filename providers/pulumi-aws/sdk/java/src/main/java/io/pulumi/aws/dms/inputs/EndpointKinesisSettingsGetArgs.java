// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.dms.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.core.internal.Codegen;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class EndpointKinesisSettingsGetArgs extends io.pulumi.resources.ResourceArgs {

    public static final EndpointKinesisSettingsGetArgs Empty = new EndpointKinesisSettingsGetArgs();

    /**
     * Shows detailed control information for table definition, column definition, and table and column changes in the Kinesis message output. The default is `false`.
     * 
     */
    @Import(name="includeControlDetails")
      private final @Nullable Output<Boolean> includeControlDetails;

    public Output<Boolean> includeControlDetails() {
        return this.includeControlDetails == null ? Codegen.empty() : this.includeControlDetails;
    }

    /**
     * Include NULL and empty columns in the target. The default is `false`.
     * 
     */
    @Import(name="includeNullAndEmpty")
      private final @Nullable Output<Boolean> includeNullAndEmpty;

    public Output<Boolean> includeNullAndEmpty() {
        return this.includeNullAndEmpty == null ? Codegen.empty() : this.includeNullAndEmpty;
    }

    /**
     * Shows the partition value within the Kinesis message output, unless the partition type is schema-table-type. The default is `false`.
     * 
     */
    @Import(name="includePartitionValue")
      private final @Nullable Output<Boolean> includePartitionValue;

    public Output<Boolean> includePartitionValue() {
        return this.includePartitionValue == null ? Codegen.empty() : this.includePartitionValue;
    }

    /**
     * Includes any data definition language (DDL) operations that change the table in the control data. The default is `false`.
     * 
     */
    @Import(name="includeTableAlterOperations")
      private final @Nullable Output<Boolean> includeTableAlterOperations;

    public Output<Boolean> includeTableAlterOperations() {
        return this.includeTableAlterOperations == null ? Codegen.empty() : this.includeTableAlterOperations;
    }

    /**
     * Provides detailed transaction information from the source database. The default is `false`.
     * 
     */
    @Import(name="includeTransactionDetails")
      private final @Nullable Output<Boolean> includeTransactionDetails;

    public Output<Boolean> includeTransactionDetails() {
        return this.includeTransactionDetails == null ? Codegen.empty() : this.includeTransactionDetails;
    }

    /**
     * Output format for the records created. Defaults to `json`. Valid values are `json` and `json_unformatted` (a single line with no tab).
     * 
     */
    @Import(name="messageFormat")
      private final @Nullable Output<String> messageFormat;

    public Output<String> messageFormat() {
        return this.messageFormat == null ? Codegen.empty() : this.messageFormat;
    }

    /**
     * Prefixes schema and table names to partition values, when the partition type is primary-key-type. The default is `false`.
     * 
     */
    @Import(name="partitionIncludeSchemaTable")
      private final @Nullable Output<Boolean> partitionIncludeSchemaTable;

    public Output<Boolean> partitionIncludeSchemaTable() {
        return this.partitionIncludeSchemaTable == null ? Codegen.empty() : this.partitionIncludeSchemaTable;
    }

    /**
     * Amazon Resource Name (ARN) of the IAM Role with permissions to write to the Kinesis data stream.
     * 
     */
    @Import(name="serviceAccessRoleArn")
      private final @Nullable Output<String> serviceAccessRoleArn;

    public Output<String> serviceAccessRoleArn() {
        return this.serviceAccessRoleArn == null ? Codegen.empty() : this.serviceAccessRoleArn;
    }

    /**
     * Amazon Resource Name (ARN) of the Kinesis data stream.
     * 
     */
    @Import(name="streamArn")
      private final @Nullable Output<String> streamArn;

    public Output<String> streamArn() {
        return this.streamArn == null ? Codegen.empty() : this.streamArn;
    }

    public EndpointKinesisSettingsGetArgs(
        @Nullable Output<Boolean> includeControlDetails,
        @Nullable Output<Boolean> includeNullAndEmpty,
        @Nullable Output<Boolean> includePartitionValue,
        @Nullable Output<Boolean> includeTableAlterOperations,
        @Nullable Output<Boolean> includeTransactionDetails,
        @Nullable Output<String> messageFormat,
        @Nullable Output<Boolean> partitionIncludeSchemaTable,
        @Nullable Output<String> serviceAccessRoleArn,
        @Nullable Output<String> streamArn) {
        this.includeControlDetails = includeControlDetails;
        this.includeNullAndEmpty = includeNullAndEmpty;
        this.includePartitionValue = includePartitionValue;
        this.includeTableAlterOperations = includeTableAlterOperations;
        this.includeTransactionDetails = includeTransactionDetails;
        this.messageFormat = messageFormat;
        this.partitionIncludeSchemaTable = partitionIncludeSchemaTable;
        this.serviceAccessRoleArn = serviceAccessRoleArn;
        this.streamArn = streamArn;
    }

    private EndpointKinesisSettingsGetArgs() {
        this.includeControlDetails = Codegen.empty();
        this.includeNullAndEmpty = Codegen.empty();
        this.includePartitionValue = Codegen.empty();
        this.includeTableAlterOperations = Codegen.empty();
        this.includeTransactionDetails = Codegen.empty();
        this.messageFormat = Codegen.empty();
        this.partitionIncludeSchemaTable = Codegen.empty();
        this.serviceAccessRoleArn = Codegen.empty();
        this.streamArn = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(EndpointKinesisSettingsGetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<Boolean> includeControlDetails;
        private @Nullable Output<Boolean> includeNullAndEmpty;
        private @Nullable Output<Boolean> includePartitionValue;
        private @Nullable Output<Boolean> includeTableAlterOperations;
        private @Nullable Output<Boolean> includeTransactionDetails;
        private @Nullable Output<String> messageFormat;
        private @Nullable Output<Boolean> partitionIncludeSchemaTable;
        private @Nullable Output<String> serviceAccessRoleArn;
        private @Nullable Output<String> streamArn;

        public Builder() {
    	      // Empty
        }

        public Builder(EndpointKinesisSettingsGetArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.includeControlDetails = defaults.includeControlDetails;
    	      this.includeNullAndEmpty = defaults.includeNullAndEmpty;
    	      this.includePartitionValue = defaults.includePartitionValue;
    	      this.includeTableAlterOperations = defaults.includeTableAlterOperations;
    	      this.includeTransactionDetails = defaults.includeTransactionDetails;
    	      this.messageFormat = defaults.messageFormat;
    	      this.partitionIncludeSchemaTable = defaults.partitionIncludeSchemaTable;
    	      this.serviceAccessRoleArn = defaults.serviceAccessRoleArn;
    	      this.streamArn = defaults.streamArn;
        }

        public Builder includeControlDetails(@Nullable Output<Boolean> includeControlDetails) {
            this.includeControlDetails = includeControlDetails;
            return this;
        }
        public Builder includeControlDetails(@Nullable Boolean includeControlDetails) {
            this.includeControlDetails = Codegen.ofNullable(includeControlDetails);
            return this;
        }
        public Builder includeNullAndEmpty(@Nullable Output<Boolean> includeNullAndEmpty) {
            this.includeNullAndEmpty = includeNullAndEmpty;
            return this;
        }
        public Builder includeNullAndEmpty(@Nullable Boolean includeNullAndEmpty) {
            this.includeNullAndEmpty = Codegen.ofNullable(includeNullAndEmpty);
            return this;
        }
        public Builder includePartitionValue(@Nullable Output<Boolean> includePartitionValue) {
            this.includePartitionValue = includePartitionValue;
            return this;
        }
        public Builder includePartitionValue(@Nullable Boolean includePartitionValue) {
            this.includePartitionValue = Codegen.ofNullable(includePartitionValue);
            return this;
        }
        public Builder includeTableAlterOperations(@Nullable Output<Boolean> includeTableAlterOperations) {
            this.includeTableAlterOperations = includeTableAlterOperations;
            return this;
        }
        public Builder includeTableAlterOperations(@Nullable Boolean includeTableAlterOperations) {
            this.includeTableAlterOperations = Codegen.ofNullable(includeTableAlterOperations);
            return this;
        }
        public Builder includeTransactionDetails(@Nullable Output<Boolean> includeTransactionDetails) {
            this.includeTransactionDetails = includeTransactionDetails;
            return this;
        }
        public Builder includeTransactionDetails(@Nullable Boolean includeTransactionDetails) {
            this.includeTransactionDetails = Codegen.ofNullable(includeTransactionDetails);
            return this;
        }
        public Builder messageFormat(@Nullable Output<String> messageFormat) {
            this.messageFormat = messageFormat;
            return this;
        }
        public Builder messageFormat(@Nullable String messageFormat) {
            this.messageFormat = Codegen.ofNullable(messageFormat);
            return this;
        }
        public Builder partitionIncludeSchemaTable(@Nullable Output<Boolean> partitionIncludeSchemaTable) {
            this.partitionIncludeSchemaTable = partitionIncludeSchemaTable;
            return this;
        }
        public Builder partitionIncludeSchemaTable(@Nullable Boolean partitionIncludeSchemaTable) {
            this.partitionIncludeSchemaTable = Codegen.ofNullable(partitionIncludeSchemaTable);
            return this;
        }
        public Builder serviceAccessRoleArn(@Nullable Output<String> serviceAccessRoleArn) {
            this.serviceAccessRoleArn = serviceAccessRoleArn;
            return this;
        }
        public Builder serviceAccessRoleArn(@Nullable String serviceAccessRoleArn) {
            this.serviceAccessRoleArn = Codegen.ofNullable(serviceAccessRoleArn);
            return this;
        }
        public Builder streamArn(@Nullable Output<String> streamArn) {
            this.streamArn = streamArn;
            return this;
        }
        public Builder streamArn(@Nullable String streamArn) {
            this.streamArn = Codegen.ofNullable(streamArn);
            return this;
        }        public EndpointKinesisSettingsGetArgs build() {
            return new EndpointKinesisSettingsGetArgs(includeControlDetails, includeNullAndEmpty, includePartitionValue, includeTableAlterOperations, includeTransactionDetails, messageFormat, partitionIncludeSchemaTable, serviceAccessRoleArn, streamArn);
        }
    }
}
