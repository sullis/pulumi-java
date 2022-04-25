// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.dataproc_v1.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.googlenative.dataproc_v1.inputs.SparkHistoryServerConfigArgs;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * Auxiliary services configuration for a workload.
 * 
 */
public final class PeripheralsConfigArgs extends com.pulumi.resources.ResourceArgs {

    public static final PeripheralsConfigArgs Empty = new PeripheralsConfigArgs();

    /**
     * Optional. Resource name of an existing Dataproc Metastore service.Example: projects/[project_id]/locations/[region]/services/[service_id]
     * 
     */
    @Import(name="metastoreService")
    private @Nullable Output<String> metastoreService;

    /**
     * @return Optional. Resource name of an existing Dataproc Metastore service.Example: projects/[project_id]/locations/[region]/services/[service_id]
     * 
     */
    public Optional<Output<String>> metastoreService() {
        return Optional.ofNullable(this.metastoreService);
    }

    /**
     * Optional. The Spark History Server configuration for the workload.
     * 
     */
    @Import(name="sparkHistoryServerConfig")
    private @Nullable Output<SparkHistoryServerConfigArgs> sparkHistoryServerConfig;

    /**
     * @return Optional. The Spark History Server configuration for the workload.
     * 
     */
    public Optional<Output<SparkHistoryServerConfigArgs>> sparkHistoryServerConfig() {
        return Optional.ofNullable(this.sparkHistoryServerConfig);
    }

    private PeripheralsConfigArgs() {}

    private PeripheralsConfigArgs(PeripheralsConfigArgs $) {
        this.metastoreService = $.metastoreService;
        this.sparkHistoryServerConfig = $.sparkHistoryServerConfig;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(PeripheralsConfigArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private PeripheralsConfigArgs $;

        public Builder() {
            $ = new PeripheralsConfigArgs();
        }

        public Builder(PeripheralsConfigArgs defaults) {
            $ = new PeripheralsConfigArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param metastoreService Optional. Resource name of an existing Dataproc Metastore service.Example: projects/[project_id]/locations/[region]/services/[service_id]
         * 
         * @return builder
         * 
         */
        public Builder metastoreService(@Nullable Output<String> metastoreService) {
            $.metastoreService = metastoreService;
            return this;
        }

        /**
         * @param metastoreService Optional. Resource name of an existing Dataproc Metastore service.Example: projects/[project_id]/locations/[region]/services/[service_id]
         * 
         * @return builder
         * 
         */
        public Builder metastoreService(String metastoreService) {
            return metastoreService(Output.of(metastoreService));
        }

        /**
         * @param sparkHistoryServerConfig Optional. The Spark History Server configuration for the workload.
         * 
         * @return builder
         * 
         */
        public Builder sparkHistoryServerConfig(@Nullable Output<SparkHistoryServerConfigArgs> sparkHistoryServerConfig) {
            $.sparkHistoryServerConfig = sparkHistoryServerConfig;
            return this;
        }

        /**
         * @param sparkHistoryServerConfig Optional. The Spark History Server configuration for the workload.
         * 
         * @return builder
         * 
         */
        public Builder sparkHistoryServerConfig(SparkHistoryServerConfigArgs sparkHistoryServerConfig) {
            return sparkHistoryServerConfig(Output.of(sparkHistoryServerConfig));
        }

        public PeripheralsConfigArgs build() {
            return $;
        }
    }

}
