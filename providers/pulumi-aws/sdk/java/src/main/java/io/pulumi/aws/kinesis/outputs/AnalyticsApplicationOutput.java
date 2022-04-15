// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.kinesis.outputs;

import io.pulumi.aws.kinesis.outputs.AnalyticsApplicationOutputKinesisFirehose;
import io.pulumi.aws.kinesis.outputs.AnalyticsApplicationOutputKinesisStream;
import io.pulumi.aws.kinesis.outputs.AnalyticsApplicationOutputLambda;
import io.pulumi.aws.kinesis.outputs.AnalyticsApplicationOutputSchema;
import io.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class AnalyticsApplicationOutput {
    /**
     * The ARN of the Kinesis Analytics Application.
     * 
     */
    private final @Nullable String id;
    /**
     * The Kinesis Firehose configuration for the destination stream. Conflicts with `kinesis_stream`.
     * See Kinesis Firehose below for more details.
     * 
     */
    private final @Nullable AnalyticsApplicationOutputKinesisFirehose kinesisFirehose;
    /**
     * The Kinesis Stream configuration for the destination stream. Conflicts with `kinesis_firehose`.
     * See Kinesis Stream below for more details.
     * 
     */
    private final @Nullable AnalyticsApplicationOutputKinesisStream kinesisStream;
    /**
     * The Lambda function destination. See Lambda below for more details.
     * 
     */
    private final @Nullable AnalyticsApplicationOutputLambda lambda;
    /**
     * The Name of the in-application stream.
     * 
     */
    private final String name;
    /**
     * The Schema format of the data written to the destination. See Destination Schema below for more details.
     * 
     */
    private final AnalyticsApplicationOutputSchema schema;

    @CustomType.Constructor
    private AnalyticsApplicationOutput(
        @CustomType.Parameter("id") @Nullable String id,
        @CustomType.Parameter("kinesisFirehose") @Nullable AnalyticsApplicationOutputKinesisFirehose kinesisFirehose,
        @CustomType.Parameter("kinesisStream") @Nullable AnalyticsApplicationOutputKinesisStream kinesisStream,
        @CustomType.Parameter("lambda") @Nullable AnalyticsApplicationOutputLambda lambda,
        @CustomType.Parameter("name") String name,
        @CustomType.Parameter("schema") AnalyticsApplicationOutputSchema schema) {
        this.id = id;
        this.kinesisFirehose = kinesisFirehose;
        this.kinesisStream = kinesisStream;
        this.lambda = lambda;
        this.name = name;
        this.schema = schema;
    }

    /**
     * The ARN of the Kinesis Analytics Application.
     * 
    */
    public Optional<String> id() {
        return Optional.ofNullable(this.id);
    }
    /**
     * The Kinesis Firehose configuration for the destination stream. Conflicts with `kinesis_stream`.
     * See Kinesis Firehose below for more details.
     * 
    */
    public Optional<AnalyticsApplicationOutputKinesisFirehose> kinesisFirehose() {
        return Optional.ofNullable(this.kinesisFirehose);
    }
    /**
     * The Kinesis Stream configuration for the destination stream. Conflicts with `kinesis_firehose`.
     * See Kinesis Stream below for more details.
     * 
    */
    public Optional<AnalyticsApplicationOutputKinesisStream> kinesisStream() {
        return Optional.ofNullable(this.kinesisStream);
    }
    /**
     * The Lambda function destination. See Lambda below for more details.
     * 
    */
    public Optional<AnalyticsApplicationOutputLambda> lambda() {
        return Optional.ofNullable(this.lambda);
    }
    /**
     * The Name of the in-application stream.
     * 
    */
    public String name() {
        return this.name;
    }
    /**
     * The Schema format of the data written to the destination. See Destination Schema below for more details.
     * 
    */
    public AnalyticsApplicationOutputSchema schema() {
        return this.schema;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(AnalyticsApplicationOutput defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String id;
        private @Nullable AnalyticsApplicationOutputKinesisFirehose kinesisFirehose;
        private @Nullable AnalyticsApplicationOutputKinesisStream kinesisStream;
        private @Nullable AnalyticsApplicationOutputLambda lambda;
        private String name;
        private AnalyticsApplicationOutputSchema schema;

        public Builder() {
    	      // Empty
        }

        public Builder(AnalyticsApplicationOutput defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.id = defaults.id;
    	      this.kinesisFirehose = defaults.kinesisFirehose;
    	      this.kinesisStream = defaults.kinesisStream;
    	      this.lambda = defaults.lambda;
    	      this.name = defaults.name;
    	      this.schema = defaults.schema;
        }

        public Builder id(@Nullable String id) {
            this.id = id;
            return this;
        }
        public Builder kinesisFirehose(@Nullable AnalyticsApplicationOutputKinesisFirehose kinesisFirehose) {
            this.kinesisFirehose = kinesisFirehose;
            return this;
        }
        public Builder kinesisStream(@Nullable AnalyticsApplicationOutputKinesisStream kinesisStream) {
            this.kinesisStream = kinesisStream;
            return this;
        }
        public Builder lambda(@Nullable AnalyticsApplicationOutputLambda lambda) {
            this.lambda = lambda;
            return this;
        }
        public Builder name(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }
        public Builder schema(AnalyticsApplicationOutputSchema schema) {
            this.schema = Objects.requireNonNull(schema);
            return this;
        }        public AnalyticsApplicationOutput build() {
            return new AnalyticsApplicationOutput(id, kinesisFirehose, kinesisStream, lambda, name, schema);
        }
    }
}
