// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.kinesis.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.core.internal.Codegen;
import java.lang.Boolean;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import javax.annotation.Nullable;


public final class FirehoseDeliveryStreamExtendedS3ConfigurationDataFormatConversionConfigurationInputFormatConfigurationDeserializerOpenXJsonSerDeArgs extends io.pulumi.resources.ResourceArgs {

    public static final FirehoseDeliveryStreamExtendedS3ConfigurationDataFormatConversionConfigurationInputFormatConfigurationDeserializerOpenXJsonSerDeArgs Empty = new FirehoseDeliveryStreamExtendedS3ConfigurationDataFormatConversionConfigurationInputFormatConfigurationDeserializerOpenXJsonSerDeArgs();

    /**
     * When set to true, which is the default, Kinesis Data Firehose converts JSON keys to lowercase before deserializing them.
     * 
     */
    @Import(name="caseInsensitive")
      private final @Nullable Output<Boolean> caseInsensitive;

    public Output<Boolean> caseInsensitive() {
        return this.caseInsensitive == null ? Codegen.empty() : this.caseInsensitive;
    }

    /**
     * A map of column names to JSON keys that aren't identical to the column names. This is useful when the JSON contains keys that are Hive keywords. For example, timestamp is a Hive keyword. If you have a JSON key named timestamp, set this parameter to `{ ts = "timestamp" }` to map this key to a column named ts.
     * 
     */
    @Import(name="columnToJsonKeyMappings")
      private final @Nullable Output<Map<String,String>> columnToJsonKeyMappings;

    public Output<Map<String,String>> columnToJsonKeyMappings() {
        return this.columnToJsonKeyMappings == null ? Codegen.empty() : this.columnToJsonKeyMappings;
    }

    /**
     * When set to `true`, specifies that the names of the keys include dots and that you want Kinesis Data Firehose to replace them with underscores. This is useful because Apache Hive does not allow dots in column names. For example, if the JSON contains a key whose name is "a.b", you can define the column name to be "a_b" when using this option. Defaults to `false`.
     * 
     */
    @Import(name="convertDotsInJsonKeysToUnderscores")
      private final @Nullable Output<Boolean> convertDotsInJsonKeysToUnderscores;

    public Output<Boolean> convertDotsInJsonKeysToUnderscores() {
        return this.convertDotsInJsonKeysToUnderscores == null ? Codegen.empty() : this.convertDotsInJsonKeysToUnderscores;
    }

    public FirehoseDeliveryStreamExtendedS3ConfigurationDataFormatConversionConfigurationInputFormatConfigurationDeserializerOpenXJsonSerDeArgs(
        @Nullable Output<Boolean> caseInsensitive,
        @Nullable Output<Map<String,String>> columnToJsonKeyMappings,
        @Nullable Output<Boolean> convertDotsInJsonKeysToUnderscores) {
        this.caseInsensitive = caseInsensitive;
        this.columnToJsonKeyMappings = columnToJsonKeyMappings;
        this.convertDotsInJsonKeysToUnderscores = convertDotsInJsonKeysToUnderscores;
    }

    private FirehoseDeliveryStreamExtendedS3ConfigurationDataFormatConversionConfigurationInputFormatConfigurationDeserializerOpenXJsonSerDeArgs() {
        this.caseInsensitive = Codegen.empty();
        this.columnToJsonKeyMappings = Codegen.empty();
        this.convertDotsInJsonKeysToUnderscores = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(FirehoseDeliveryStreamExtendedS3ConfigurationDataFormatConversionConfigurationInputFormatConfigurationDeserializerOpenXJsonSerDeArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<Boolean> caseInsensitive;
        private @Nullable Output<Map<String,String>> columnToJsonKeyMappings;
        private @Nullable Output<Boolean> convertDotsInJsonKeysToUnderscores;

        public Builder() {
    	      // Empty
        }

        public Builder(FirehoseDeliveryStreamExtendedS3ConfigurationDataFormatConversionConfigurationInputFormatConfigurationDeserializerOpenXJsonSerDeArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.caseInsensitive = defaults.caseInsensitive;
    	      this.columnToJsonKeyMappings = defaults.columnToJsonKeyMappings;
    	      this.convertDotsInJsonKeysToUnderscores = defaults.convertDotsInJsonKeysToUnderscores;
        }

        public Builder caseInsensitive(@Nullable Output<Boolean> caseInsensitive) {
            this.caseInsensitive = caseInsensitive;
            return this;
        }
        public Builder caseInsensitive(@Nullable Boolean caseInsensitive) {
            this.caseInsensitive = Codegen.ofNullable(caseInsensitive);
            return this;
        }
        public Builder columnToJsonKeyMappings(@Nullable Output<Map<String,String>> columnToJsonKeyMappings) {
            this.columnToJsonKeyMappings = columnToJsonKeyMappings;
            return this;
        }
        public Builder columnToJsonKeyMappings(@Nullable Map<String,String> columnToJsonKeyMappings) {
            this.columnToJsonKeyMappings = Codegen.ofNullable(columnToJsonKeyMappings);
            return this;
        }
        public Builder convertDotsInJsonKeysToUnderscores(@Nullable Output<Boolean> convertDotsInJsonKeysToUnderscores) {
            this.convertDotsInJsonKeysToUnderscores = convertDotsInJsonKeysToUnderscores;
            return this;
        }
        public Builder convertDotsInJsonKeysToUnderscores(@Nullable Boolean convertDotsInJsonKeysToUnderscores) {
            this.convertDotsInJsonKeysToUnderscores = Codegen.ofNullable(convertDotsInJsonKeysToUnderscores);
            return this;
        }        public FirehoseDeliveryStreamExtendedS3ConfigurationDataFormatConversionConfigurationInputFormatConfigurationDeserializerOpenXJsonSerDeArgs build() {
            return new FirehoseDeliveryStreamExtendedS3ConfigurationDataFormatConversionConfigurationInputFormatConfigurationDeserializerOpenXJsonSerDeArgs(caseInsensitive, columnToJsonKeyMappings, convertDotsInJsonKeysToUnderscores);
        }
    }
}
