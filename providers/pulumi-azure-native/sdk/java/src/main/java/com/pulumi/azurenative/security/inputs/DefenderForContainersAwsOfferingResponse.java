// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.security.inputs;

import com.pulumi.azurenative.security.inputs.DefenderForContainersAwsOfferingResponseCloudWatchToKinesis;
import com.pulumi.azurenative.security.inputs.DefenderForContainersAwsOfferingResponseKinesisToS3;
import com.pulumi.azurenative.security.inputs.DefenderForContainersAwsOfferingResponseKubernetesScubaReader;
import com.pulumi.azurenative.security.inputs.DefenderForContainersAwsOfferingResponseKubernetesService;
import com.pulumi.core.annotations.Import;
import com.pulumi.core.internal.Codegen;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * The Defender for Containers AWS offering configurations
 * 
 */
public final class DefenderForContainersAwsOfferingResponse extends com.pulumi.resources.InvokeArgs {

    public static final DefenderForContainersAwsOfferingResponse Empty = new DefenderForContainersAwsOfferingResponse();

    /**
     * The cloudwatch to kinesis connection configuration
     * 
     */
    @Import(name="cloudWatchToKinesis")
    private @Nullable DefenderForContainersAwsOfferingResponseCloudWatchToKinesis cloudWatchToKinesis;

    /**
     * @return The cloudwatch to kinesis connection configuration
     * 
     */
    public Optional<DefenderForContainersAwsOfferingResponseCloudWatchToKinesis> cloudWatchToKinesis() {
        return Optional.ofNullable(this.cloudWatchToKinesis);
    }

    /**
     * The offering description.
     * 
     */
    @Import(name="description", required=true)
    private String description;

    /**
     * @return The offering description.
     * 
     */
    public String description() {
        return this.description;
    }

    /**
     * The kinesis to s3 connection configuration
     * 
     */
    @Import(name="kinesisToS3")
    private @Nullable DefenderForContainersAwsOfferingResponseKinesisToS3 kinesisToS3;

    /**
     * @return The kinesis to s3 connection configuration
     * 
     */
    public Optional<DefenderForContainersAwsOfferingResponseKinesisToS3> kinesisToS3() {
        return Optional.ofNullable(this.kinesisToS3);
    }

    /**
     * The kubernetes to scuba connection configuration
     * 
     */
    @Import(name="kubernetesScubaReader")
    private @Nullable DefenderForContainersAwsOfferingResponseKubernetesScubaReader kubernetesScubaReader;

    /**
     * @return The kubernetes to scuba connection configuration
     * 
     */
    public Optional<DefenderForContainersAwsOfferingResponseKubernetesScubaReader> kubernetesScubaReader() {
        return Optional.ofNullable(this.kubernetesScubaReader);
    }

    /**
     * The kubernetes service connection configuration
     * 
     */
    @Import(name="kubernetesService")
    private @Nullable DefenderForContainersAwsOfferingResponseKubernetesService kubernetesService;

    /**
     * @return The kubernetes service connection configuration
     * 
     */
    public Optional<DefenderForContainersAwsOfferingResponseKubernetesService> kubernetesService() {
        return Optional.ofNullable(this.kubernetesService);
    }

    /**
     * The type of the security offering.
     * Expected value is &#39;DefenderForContainersAws&#39;.
     * 
     */
    @Import(name="offeringType", required=true)
    private String offeringType;

    /**
     * @return The type of the security offering.
     * Expected value is &#39;DefenderForContainersAws&#39;.
     * 
     */
    public String offeringType() {
        return this.offeringType;
    }

    private DefenderForContainersAwsOfferingResponse() {}

    private DefenderForContainersAwsOfferingResponse(DefenderForContainersAwsOfferingResponse $) {
        this.cloudWatchToKinesis = $.cloudWatchToKinesis;
        this.description = $.description;
        this.kinesisToS3 = $.kinesisToS3;
        this.kubernetesScubaReader = $.kubernetesScubaReader;
        this.kubernetesService = $.kubernetesService;
        this.offeringType = $.offeringType;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(DefenderForContainersAwsOfferingResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private DefenderForContainersAwsOfferingResponse $;

        public Builder() {
            $ = new DefenderForContainersAwsOfferingResponse();
        }

        public Builder(DefenderForContainersAwsOfferingResponse defaults) {
            $ = new DefenderForContainersAwsOfferingResponse(Objects.requireNonNull(defaults));
        }

        /**
         * @param cloudWatchToKinesis The cloudwatch to kinesis connection configuration
         * 
         * @return builder
         * 
         */
        public Builder cloudWatchToKinesis(@Nullable DefenderForContainersAwsOfferingResponseCloudWatchToKinesis cloudWatchToKinesis) {
            $.cloudWatchToKinesis = cloudWatchToKinesis;
            return this;
        }

        /**
         * @param description The offering description.
         * 
         * @return builder
         * 
         */
        public Builder description(String description) {
            $.description = description;
            return this;
        }

        /**
         * @param kinesisToS3 The kinesis to s3 connection configuration
         * 
         * @return builder
         * 
         */
        public Builder kinesisToS3(@Nullable DefenderForContainersAwsOfferingResponseKinesisToS3 kinesisToS3) {
            $.kinesisToS3 = kinesisToS3;
            return this;
        }

        /**
         * @param kubernetesScubaReader The kubernetes to scuba connection configuration
         * 
         * @return builder
         * 
         */
        public Builder kubernetesScubaReader(@Nullable DefenderForContainersAwsOfferingResponseKubernetesScubaReader kubernetesScubaReader) {
            $.kubernetesScubaReader = kubernetesScubaReader;
            return this;
        }

        /**
         * @param kubernetesService The kubernetes service connection configuration
         * 
         * @return builder
         * 
         */
        public Builder kubernetesService(@Nullable DefenderForContainersAwsOfferingResponseKubernetesService kubernetesService) {
            $.kubernetesService = kubernetesService;
            return this;
        }

        /**
         * @param offeringType The type of the security offering.
         * Expected value is &#39;DefenderForContainersAws&#39;.
         * 
         * @return builder
         * 
         */
        public Builder offeringType(String offeringType) {
            $.offeringType = offeringType;
            return this;
        }

        public DefenderForContainersAwsOfferingResponse build() {
            $.description = Objects.requireNonNull($.description, "expected parameter 'description' to be non-null");
            $.offeringType = Codegen.stringProp("offeringType").arg($.offeringType).require();
            return $;
        }
    }

}
