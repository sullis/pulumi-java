// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.security.inputs;

import io.pulumi.azurenative.security.inputs.DefenderForContainersAwsOfferingResponseCloudWatchToKinesis;
import io.pulumi.azurenative.security.inputs.DefenderForContainersAwsOfferingResponseKinesisToS3;
import io.pulumi.azurenative.security.inputs.DefenderForContainersAwsOfferingResponseKubernetesScubaReader;
import io.pulumi.azurenative.security.inputs.DefenderForContainersAwsOfferingResponseKubernetesService;
import io.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * The Defender for Containers AWS offering configurations
 * 
 */
public final class DefenderForContainersAwsOfferingResponse extends io.pulumi.resources.InvokeArgs {

    public static final DefenderForContainersAwsOfferingResponse Empty = new DefenderForContainersAwsOfferingResponse();

    /**
     * The cloudwatch to kinesis connection configuration
     * 
     */
    @Import(name="cloudWatchToKinesis")
      private final @Nullable DefenderForContainersAwsOfferingResponseCloudWatchToKinesis cloudWatchToKinesis;

    public Optional<DefenderForContainersAwsOfferingResponseCloudWatchToKinesis> getCloudWatchToKinesis() {
        return this.cloudWatchToKinesis == null ? Optional.empty() : Optional.ofNullable(this.cloudWatchToKinesis);
    }

    /**
     * The offering description.
     * 
     */
    @Import(name="description", required=true)
      private final String description;

    public String getDescription() {
        return this.description;
    }

    /**
     * The kinesis to s3 connection configuration
     * 
     */
    @Import(name="kinesisToS3")
      private final @Nullable DefenderForContainersAwsOfferingResponseKinesisToS3 kinesisToS3;

    public Optional<DefenderForContainersAwsOfferingResponseKinesisToS3> getKinesisToS3() {
        return this.kinesisToS3 == null ? Optional.empty() : Optional.ofNullable(this.kinesisToS3);
    }

    /**
     * The kubernetes to scuba connection configuration
     * 
     */
    @Import(name="kubernetesScubaReader")
      private final @Nullable DefenderForContainersAwsOfferingResponseKubernetesScubaReader kubernetesScubaReader;

    public Optional<DefenderForContainersAwsOfferingResponseKubernetesScubaReader> getKubernetesScubaReader() {
        return this.kubernetesScubaReader == null ? Optional.empty() : Optional.ofNullable(this.kubernetesScubaReader);
    }

    /**
     * The kubernetes service connection configuration
     * 
     */
    @Import(name="kubernetesService")
      private final @Nullable DefenderForContainersAwsOfferingResponseKubernetesService kubernetesService;

    public Optional<DefenderForContainersAwsOfferingResponseKubernetesService> getKubernetesService() {
        return this.kubernetesService == null ? Optional.empty() : Optional.ofNullable(this.kubernetesService);
    }

    /**
     * The type of the security offering.
     * Expected value is 'DefenderForContainersAws'.
     * 
     */
    @Import(name="offeringType", required=true)
      private final String offeringType;

    public String getOfferingType() {
        return this.offeringType;
    }

    public DefenderForContainersAwsOfferingResponse(
        @Nullable DefenderForContainersAwsOfferingResponseCloudWatchToKinesis cloudWatchToKinesis,
        String description,
        @Nullable DefenderForContainersAwsOfferingResponseKinesisToS3 kinesisToS3,
        @Nullable DefenderForContainersAwsOfferingResponseKubernetesScubaReader kubernetesScubaReader,
        @Nullable DefenderForContainersAwsOfferingResponseKubernetesService kubernetesService,
        String offeringType) {
        this.cloudWatchToKinesis = cloudWatchToKinesis;
        this.description = Objects.requireNonNull(description, "expected parameter 'description' to be non-null");
        this.kinesisToS3 = kinesisToS3;
        this.kubernetesScubaReader = kubernetesScubaReader;
        this.kubernetesService = kubernetesService;
        this.offeringType = Objects.requireNonNull(offeringType, "expected parameter 'offeringType' to be non-null");
    }

    private DefenderForContainersAwsOfferingResponse() {
        this.cloudWatchToKinesis = null;
        this.description = null;
        this.kinesisToS3 = null;
        this.kubernetesScubaReader = null;
        this.kubernetesService = null;
        this.offeringType = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(DefenderForContainersAwsOfferingResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable DefenderForContainersAwsOfferingResponseCloudWatchToKinesis cloudWatchToKinesis;
        private String description;
        private @Nullable DefenderForContainersAwsOfferingResponseKinesisToS3 kinesisToS3;
        private @Nullable DefenderForContainersAwsOfferingResponseKubernetesScubaReader kubernetesScubaReader;
        private @Nullable DefenderForContainersAwsOfferingResponseKubernetesService kubernetesService;
        private String offeringType;

        public Builder() {
    	      // Empty
        }

        public Builder(DefenderForContainersAwsOfferingResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.cloudWatchToKinesis = defaults.cloudWatchToKinesis;
    	      this.description = defaults.description;
    	      this.kinesisToS3 = defaults.kinesisToS3;
    	      this.kubernetesScubaReader = defaults.kubernetesScubaReader;
    	      this.kubernetesService = defaults.kubernetesService;
    	      this.offeringType = defaults.offeringType;
        }

        public Builder cloudWatchToKinesis(@Nullable DefenderForContainersAwsOfferingResponseCloudWatchToKinesis cloudWatchToKinesis) {
            this.cloudWatchToKinesis = cloudWatchToKinesis;
            return this;
        }
        public Builder description(String description) {
            this.description = Objects.requireNonNull(description);
            return this;
        }
        public Builder kinesisToS3(@Nullable DefenderForContainersAwsOfferingResponseKinesisToS3 kinesisToS3) {
            this.kinesisToS3 = kinesisToS3;
            return this;
        }
        public Builder kubernetesScubaReader(@Nullable DefenderForContainersAwsOfferingResponseKubernetesScubaReader kubernetesScubaReader) {
            this.kubernetesScubaReader = kubernetesScubaReader;
            return this;
        }
        public Builder kubernetesService(@Nullable DefenderForContainersAwsOfferingResponseKubernetesService kubernetesService) {
            this.kubernetesService = kubernetesService;
            return this;
        }
        public Builder offeringType(String offeringType) {
            this.offeringType = Objects.requireNonNull(offeringType);
            return this;
        }        public DefenderForContainersAwsOfferingResponse build() {
            return new DefenderForContainersAwsOfferingResponse(cloudWatchToKinesis, description, kinesisToS3, kubernetesScubaReader, kubernetesService, offeringType);
        }
    }
}
