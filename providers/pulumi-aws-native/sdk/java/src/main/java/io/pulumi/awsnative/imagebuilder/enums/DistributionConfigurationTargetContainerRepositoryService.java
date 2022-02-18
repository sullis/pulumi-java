// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.imagebuilder.enums;

import io.pulumi.core.annotations.EnumType;
import java.lang.String;
import java.util.Objects;
import java.util.StringJoiner;

    /**
     * The service of target container repository.
     * 
     */
    @EnumType
    public enum DistributionConfigurationTargetContainerRepositoryService {
        Ecr("ECR");

        private final String value;

        DistributionConfigurationTargetContainerRepositoryService(String value) {
            this.value = Objects.requireNonNull(value);
        }

        @EnumType.Converter
        public String getValue() {
            return this.value;
        }

        @Override
        public String toString() {
            return new StringJoiner(", ", "DistributionConfigurationTargetContainerRepositoryService[", "]")
                .add("value='" + this.value + "'")
                .toString();
        }
    }
