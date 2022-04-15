// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.kinesis.inputs;

import io.pulumi.aws.kinesis.inputs.FirehoseDeliveryStreamExtendedS3ConfigurationDataFormatConversionConfigurationInputFormatConfigurationDeserializerHiveJsonSerDeGetArgs;
import io.pulumi.aws.kinesis.inputs.FirehoseDeliveryStreamExtendedS3ConfigurationDataFormatConversionConfigurationInputFormatConfigurationDeserializerOpenXJsonSerDeGetArgs;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.core.internal.Codegen;
import java.util.Objects;
import javax.annotation.Nullable;


public final class FirehoseDeliveryStreamExtendedS3ConfigurationDataFormatConversionConfigurationInputFormatConfigurationDeserializerGetArgs extends io.pulumi.resources.ResourceArgs {

    public static final FirehoseDeliveryStreamExtendedS3ConfigurationDataFormatConversionConfigurationInputFormatConfigurationDeserializerGetArgs Empty = new FirehoseDeliveryStreamExtendedS3ConfigurationDataFormatConversionConfigurationInputFormatConfigurationDeserializerGetArgs();

    /**
     * Nested argument that specifies the native Hive / HCatalog JsonSerDe. More details below.
     * 
     */
    @Import(name="hiveJsonSerDe")
      private final @Nullable Output<FirehoseDeliveryStreamExtendedS3ConfigurationDataFormatConversionConfigurationInputFormatConfigurationDeserializerHiveJsonSerDeGetArgs> hiveJsonSerDe;

    public Output<FirehoseDeliveryStreamExtendedS3ConfigurationDataFormatConversionConfigurationInputFormatConfigurationDeserializerHiveJsonSerDeGetArgs> hiveJsonSerDe() {
        return this.hiveJsonSerDe == null ? Codegen.empty() : this.hiveJsonSerDe;
    }

    /**
     * Nested argument that specifies the OpenX SerDe. More details below.
     * 
     */
    @Import(name="openXJsonSerDe")
      private final @Nullable Output<FirehoseDeliveryStreamExtendedS3ConfigurationDataFormatConversionConfigurationInputFormatConfigurationDeserializerOpenXJsonSerDeGetArgs> openXJsonSerDe;

    public Output<FirehoseDeliveryStreamExtendedS3ConfigurationDataFormatConversionConfigurationInputFormatConfigurationDeserializerOpenXJsonSerDeGetArgs> openXJsonSerDe() {
        return this.openXJsonSerDe == null ? Codegen.empty() : this.openXJsonSerDe;
    }

    public FirehoseDeliveryStreamExtendedS3ConfigurationDataFormatConversionConfigurationInputFormatConfigurationDeserializerGetArgs(
        @Nullable Output<FirehoseDeliveryStreamExtendedS3ConfigurationDataFormatConversionConfigurationInputFormatConfigurationDeserializerHiveJsonSerDeGetArgs> hiveJsonSerDe,
        @Nullable Output<FirehoseDeliveryStreamExtendedS3ConfigurationDataFormatConversionConfigurationInputFormatConfigurationDeserializerOpenXJsonSerDeGetArgs> openXJsonSerDe) {
        this.hiveJsonSerDe = hiveJsonSerDe;
        this.openXJsonSerDe = openXJsonSerDe;
    }

    private FirehoseDeliveryStreamExtendedS3ConfigurationDataFormatConversionConfigurationInputFormatConfigurationDeserializerGetArgs() {
        this.hiveJsonSerDe = Codegen.empty();
        this.openXJsonSerDe = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(FirehoseDeliveryStreamExtendedS3ConfigurationDataFormatConversionConfigurationInputFormatConfigurationDeserializerGetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<FirehoseDeliveryStreamExtendedS3ConfigurationDataFormatConversionConfigurationInputFormatConfigurationDeserializerHiveJsonSerDeGetArgs> hiveJsonSerDe;
        private @Nullable Output<FirehoseDeliveryStreamExtendedS3ConfigurationDataFormatConversionConfigurationInputFormatConfigurationDeserializerOpenXJsonSerDeGetArgs> openXJsonSerDe;

        public Builder() {
    	      // Empty
        }

        public Builder(FirehoseDeliveryStreamExtendedS3ConfigurationDataFormatConversionConfigurationInputFormatConfigurationDeserializerGetArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.hiveJsonSerDe = defaults.hiveJsonSerDe;
    	      this.openXJsonSerDe = defaults.openXJsonSerDe;
        }

        public Builder hiveJsonSerDe(@Nullable Output<FirehoseDeliveryStreamExtendedS3ConfigurationDataFormatConversionConfigurationInputFormatConfigurationDeserializerHiveJsonSerDeGetArgs> hiveJsonSerDe) {
            this.hiveJsonSerDe = hiveJsonSerDe;
            return this;
        }
        public Builder hiveJsonSerDe(@Nullable FirehoseDeliveryStreamExtendedS3ConfigurationDataFormatConversionConfigurationInputFormatConfigurationDeserializerHiveJsonSerDeGetArgs hiveJsonSerDe) {
            this.hiveJsonSerDe = Codegen.ofNullable(hiveJsonSerDe);
            return this;
        }
        public Builder openXJsonSerDe(@Nullable Output<FirehoseDeliveryStreamExtendedS3ConfigurationDataFormatConversionConfigurationInputFormatConfigurationDeserializerOpenXJsonSerDeGetArgs> openXJsonSerDe) {
            this.openXJsonSerDe = openXJsonSerDe;
            return this;
        }
        public Builder openXJsonSerDe(@Nullable FirehoseDeliveryStreamExtendedS3ConfigurationDataFormatConversionConfigurationInputFormatConfigurationDeserializerOpenXJsonSerDeGetArgs openXJsonSerDe) {
            this.openXJsonSerDe = Codegen.ofNullable(openXJsonSerDe);
            return this;
        }        public FirehoseDeliveryStreamExtendedS3ConfigurationDataFormatConversionConfigurationInputFormatConfigurationDeserializerGetArgs build() {
            return new FirehoseDeliveryStreamExtendedS3ConfigurationDataFormatConversionConfigurationInputFormatConfigurationDeserializerGetArgs(hiveJsonSerDe, openXJsonSerDe);
        }
    }
}
