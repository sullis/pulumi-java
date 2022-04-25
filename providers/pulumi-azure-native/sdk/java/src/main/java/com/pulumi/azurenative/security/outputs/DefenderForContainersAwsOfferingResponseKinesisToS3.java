// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.security.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class DefenderForContainersAwsOfferingResponseKinesisToS3 {
    /**
     * @return The cloud role ARN in AWS for this feature
     * 
     */
    private final @Nullable String cloudRoleArn;

    @CustomType.Constructor
    private DefenderForContainersAwsOfferingResponseKinesisToS3(@CustomType.Parameter("cloudRoleArn") @Nullable String cloudRoleArn) {
        this.cloudRoleArn = cloudRoleArn;
    }

    /**
     * @return The cloud role ARN in AWS for this feature
     * 
     */
    public Optional<String> cloudRoleArn() {
        return Optional.ofNullable(this.cloudRoleArn);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(DefenderForContainersAwsOfferingResponseKinesisToS3 defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String cloudRoleArn;

        public Builder() {
    	      // Empty
        }

        public Builder(DefenderForContainersAwsOfferingResponseKinesisToS3 defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.cloudRoleArn = defaults.cloudRoleArn;
        }

        public Builder cloudRoleArn(@Nullable String cloudRoleArn) {
            this.cloudRoleArn = cloudRoleArn;
            return this;
        }        public DefenderForContainersAwsOfferingResponseKinesisToS3 build() {
            return new DefenderForContainersAwsOfferingResponseKinesisToS3(cloudRoleArn);
        }
    }
}
