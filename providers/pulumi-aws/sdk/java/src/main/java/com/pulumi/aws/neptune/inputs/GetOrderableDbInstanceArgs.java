// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.neptune.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetOrderableDbInstanceArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetOrderableDbInstanceArgs Empty = new GetOrderableDbInstanceArgs();

    /**
     * DB engine. (Default: `neptune`)
     * 
     */
    @Import(name="engine")
    private @Nullable Output<String> engine;

    /**
     * @return DB engine. (Default: `neptune`)
     * 
     */
    public Optional<Output<String>> engine() {
        return Optional.ofNullable(this.engine);
    }

    /**
     * Version of the DB engine. For example, `1.0.1.0`, `1.0.1.2`, `1.0.2.2`, and `1.0.3.0`.
     * 
     */
    @Import(name="engineVersion")
    private @Nullable Output<String> engineVersion;

    /**
     * @return Version of the DB engine. For example, `1.0.1.0`, `1.0.1.2`, `1.0.2.2`, and `1.0.3.0`.
     * 
     */
    public Optional<Output<String>> engineVersion() {
        return Optional.ofNullable(this.engineVersion);
    }

    /**
     * DB instance class. Examples of classes are `db.r5.large`, `db.r5.xlarge`, `db.r4.large`, `db.r5.4xlarge`, `db.r5.12xlarge`, `db.r4.xlarge`, and `db.t3.medium`.
     * 
     */
    @Import(name="instanceClass")
    private @Nullable Output<String> instanceClass;

    /**
     * @return DB instance class. Examples of classes are `db.r5.large`, `db.r5.xlarge`, `db.r4.large`, `db.r5.4xlarge`, `db.r5.12xlarge`, `db.r4.xlarge`, and `db.t3.medium`.
     * 
     */
    public Optional<Output<String>> instanceClass() {
        return Optional.ofNullable(this.instanceClass);
    }

    /**
     * License model. (Default: `amazon-license`)
     * 
     */
    @Import(name="licenseModel")
    private @Nullable Output<String> licenseModel;

    /**
     * @return License model. (Default: `amazon-license`)
     * 
     */
    public Optional<Output<String>> licenseModel() {
        return Optional.ofNullable(this.licenseModel);
    }

    /**
     * Ordered list of preferred Neptune DB instance classes. The first match in this list will be returned. If no preferred matches are found and the original search returned more than one result, an error is returned.
     * 
     */
    @Import(name="preferredInstanceClasses")
    private @Nullable Output<List<String>> preferredInstanceClasses;

    /**
     * @return Ordered list of preferred Neptune DB instance classes. The first match in this list will be returned. If no preferred matches are found and the original search returned more than one result, an error is returned.
     * 
     */
    public Optional<Output<List<String>>> preferredInstanceClasses() {
        return Optional.ofNullable(this.preferredInstanceClasses);
    }

    /**
     * Enable to show only VPC offerings.
     * 
     */
    @Import(name="vpc")
    private @Nullable Output<Boolean> vpc;

    /**
     * @return Enable to show only VPC offerings.
     * 
     */
    public Optional<Output<Boolean>> vpc() {
        return Optional.ofNullable(this.vpc);
    }

    private GetOrderableDbInstanceArgs() {}

    private GetOrderableDbInstanceArgs(GetOrderableDbInstanceArgs $) {
        this.engine = $.engine;
        this.engineVersion = $.engineVersion;
        this.instanceClass = $.instanceClass;
        this.licenseModel = $.licenseModel;
        this.preferredInstanceClasses = $.preferredInstanceClasses;
        this.vpc = $.vpc;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetOrderableDbInstanceArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetOrderableDbInstanceArgs $;

        public Builder() {
            $ = new GetOrderableDbInstanceArgs();
        }

        public Builder(GetOrderableDbInstanceArgs defaults) {
            $ = new GetOrderableDbInstanceArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param engine DB engine. (Default: `neptune`)
         * 
         * @return builder
         * 
         */
        public Builder engine(@Nullable Output<String> engine) {
            $.engine = engine;
            return this;
        }

        /**
         * @param engine DB engine. (Default: `neptune`)
         * 
         * @return builder
         * 
         */
        public Builder engine(String engine) {
            return engine(Output.of(engine));
        }

        /**
         * @param engineVersion Version of the DB engine. For example, `1.0.1.0`, `1.0.1.2`, `1.0.2.2`, and `1.0.3.0`.
         * 
         * @return builder
         * 
         */
        public Builder engineVersion(@Nullable Output<String> engineVersion) {
            $.engineVersion = engineVersion;
            return this;
        }

        /**
         * @param engineVersion Version of the DB engine. For example, `1.0.1.0`, `1.0.1.2`, `1.0.2.2`, and `1.0.3.0`.
         * 
         * @return builder
         * 
         */
        public Builder engineVersion(String engineVersion) {
            return engineVersion(Output.of(engineVersion));
        }

        /**
         * @param instanceClass DB instance class. Examples of classes are `db.r5.large`, `db.r5.xlarge`, `db.r4.large`, `db.r5.4xlarge`, `db.r5.12xlarge`, `db.r4.xlarge`, and `db.t3.medium`.
         * 
         * @return builder
         * 
         */
        public Builder instanceClass(@Nullable Output<String> instanceClass) {
            $.instanceClass = instanceClass;
            return this;
        }

        /**
         * @param instanceClass DB instance class. Examples of classes are `db.r5.large`, `db.r5.xlarge`, `db.r4.large`, `db.r5.4xlarge`, `db.r5.12xlarge`, `db.r4.xlarge`, and `db.t3.medium`.
         * 
         * @return builder
         * 
         */
        public Builder instanceClass(String instanceClass) {
            return instanceClass(Output.of(instanceClass));
        }

        /**
         * @param licenseModel License model. (Default: `amazon-license`)
         * 
         * @return builder
         * 
         */
        public Builder licenseModel(@Nullable Output<String> licenseModel) {
            $.licenseModel = licenseModel;
            return this;
        }

        /**
         * @param licenseModel License model. (Default: `amazon-license`)
         * 
         * @return builder
         * 
         */
        public Builder licenseModel(String licenseModel) {
            return licenseModel(Output.of(licenseModel));
        }

        /**
         * @param preferredInstanceClasses Ordered list of preferred Neptune DB instance classes. The first match in this list will be returned. If no preferred matches are found and the original search returned more than one result, an error is returned.
         * 
         * @return builder
         * 
         */
        public Builder preferredInstanceClasses(@Nullable Output<List<String>> preferredInstanceClasses) {
            $.preferredInstanceClasses = preferredInstanceClasses;
            return this;
        }

        /**
         * @param preferredInstanceClasses Ordered list of preferred Neptune DB instance classes. The first match in this list will be returned. If no preferred matches are found and the original search returned more than one result, an error is returned.
         * 
         * @return builder
         * 
         */
        public Builder preferredInstanceClasses(List<String> preferredInstanceClasses) {
            return preferredInstanceClasses(Output.of(preferredInstanceClasses));
        }

        /**
         * @param preferredInstanceClasses Ordered list of preferred Neptune DB instance classes. The first match in this list will be returned. If no preferred matches are found and the original search returned more than one result, an error is returned.
         * 
         * @return builder
         * 
         */
        public Builder preferredInstanceClasses(String... preferredInstanceClasses) {
            return preferredInstanceClasses(List.of(preferredInstanceClasses));
        }

        /**
         * @param vpc Enable to show only VPC offerings.
         * 
         * @return builder
         * 
         */
        public Builder vpc(@Nullable Output<Boolean> vpc) {
            $.vpc = vpc;
            return this;
        }

        /**
         * @param vpc Enable to show only VPC offerings.
         * 
         * @return builder
         * 
         */
        public Builder vpc(Boolean vpc) {
            return vpc(Output.of(vpc));
        }

        public GetOrderableDbInstanceArgs build() {
            return $;
        }
    }

}
