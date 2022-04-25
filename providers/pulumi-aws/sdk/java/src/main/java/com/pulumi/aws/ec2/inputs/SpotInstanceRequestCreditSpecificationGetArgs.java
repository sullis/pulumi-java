// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.ec2.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class SpotInstanceRequestCreditSpecificationGetArgs extends com.pulumi.resources.ResourceArgs {

    public static final SpotInstanceRequestCreditSpecificationGetArgs Empty = new SpotInstanceRequestCreditSpecificationGetArgs();

    /**
     * Credit option for CPU usage. Valid values include `standard` or `unlimited`. T3 instances are launched as unlimited by default. T2 instances are launched as standard by default.
     * 
     */
    @Import(name="cpuCredits")
    private @Nullable Output<String> cpuCredits;

    /**
     * @return Credit option for CPU usage. Valid values include `standard` or `unlimited`. T3 instances are launched as unlimited by default. T2 instances are launched as standard by default.
     * 
     */
    public Optional<Output<String>> cpuCredits() {
        return Optional.ofNullable(this.cpuCredits);
    }

    private SpotInstanceRequestCreditSpecificationGetArgs() {}

    private SpotInstanceRequestCreditSpecificationGetArgs(SpotInstanceRequestCreditSpecificationGetArgs $) {
        this.cpuCredits = $.cpuCredits;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(SpotInstanceRequestCreditSpecificationGetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private SpotInstanceRequestCreditSpecificationGetArgs $;

        public Builder() {
            $ = new SpotInstanceRequestCreditSpecificationGetArgs();
        }

        public Builder(SpotInstanceRequestCreditSpecificationGetArgs defaults) {
            $ = new SpotInstanceRequestCreditSpecificationGetArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param cpuCredits Credit option for CPU usage. Valid values include `standard` or `unlimited`. T3 instances are launched as unlimited by default. T2 instances are launched as standard by default.
         * 
         * @return builder
         * 
         */
        public Builder cpuCredits(@Nullable Output<String> cpuCredits) {
            $.cpuCredits = cpuCredits;
            return this;
        }

        /**
         * @param cpuCredits Credit option for CPU usage. Valid values include `standard` or `unlimited`. T3 instances are launched as unlimited by default. T2 instances are launched as standard by default.
         * 
         * @return builder
         * 
         */
        public Builder cpuCredits(String cpuCredits) {
            return cpuCredits(Output.of(cpuCredits));
        }

        public SpotInstanceRequestCreditSpecificationGetArgs build() {
            return $;
        }
    }

}
