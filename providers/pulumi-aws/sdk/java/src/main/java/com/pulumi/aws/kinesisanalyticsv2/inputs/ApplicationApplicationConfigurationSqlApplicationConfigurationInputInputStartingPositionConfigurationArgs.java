// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.kinesisanalyticsv2.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class ApplicationApplicationConfigurationSqlApplicationConfigurationInputInputStartingPositionConfigurationArgs extends com.pulumi.resources.ResourceArgs {

    public static final ApplicationApplicationConfigurationSqlApplicationConfigurationInputInputStartingPositionConfigurationArgs Empty = new ApplicationApplicationConfigurationSqlApplicationConfigurationInputInputStartingPositionConfigurationArgs();

    /**
     * The starting position on the stream. Valid values: `LAST_STOPPED_POINT`, `NOW`, `TRIM_HORIZON`.
     * 
     */
    @Import(name="inputStartingPosition")
    private @Nullable Output<String> inputStartingPosition;

    /**
     * @return The starting position on the stream. Valid values: `LAST_STOPPED_POINT`, `NOW`, `TRIM_HORIZON`.
     * 
     */
    public Optional<Output<String>> inputStartingPosition() {
        return Optional.ofNullable(this.inputStartingPosition);
    }

    private ApplicationApplicationConfigurationSqlApplicationConfigurationInputInputStartingPositionConfigurationArgs() {}

    private ApplicationApplicationConfigurationSqlApplicationConfigurationInputInputStartingPositionConfigurationArgs(ApplicationApplicationConfigurationSqlApplicationConfigurationInputInputStartingPositionConfigurationArgs $) {
        this.inputStartingPosition = $.inputStartingPosition;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ApplicationApplicationConfigurationSqlApplicationConfigurationInputInputStartingPositionConfigurationArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ApplicationApplicationConfigurationSqlApplicationConfigurationInputInputStartingPositionConfigurationArgs $;

        public Builder() {
            $ = new ApplicationApplicationConfigurationSqlApplicationConfigurationInputInputStartingPositionConfigurationArgs();
        }

        public Builder(ApplicationApplicationConfigurationSqlApplicationConfigurationInputInputStartingPositionConfigurationArgs defaults) {
            $ = new ApplicationApplicationConfigurationSqlApplicationConfigurationInputInputStartingPositionConfigurationArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param inputStartingPosition The starting position on the stream. Valid values: `LAST_STOPPED_POINT`, `NOW`, `TRIM_HORIZON`.
         * 
         * @return builder
         * 
         */
        public Builder inputStartingPosition(@Nullable Output<String> inputStartingPosition) {
            $.inputStartingPosition = inputStartingPosition;
            return this;
        }

        /**
         * @param inputStartingPosition The starting position on the stream. Valid values: `LAST_STOPPED_POINT`, `NOW`, `TRIM_HORIZON`.
         * 
         * @return builder
         * 
         */
        public Builder inputStartingPosition(String inputStartingPosition) {
            return inputStartingPosition(Output.of(inputStartingPosition));
        }

        public ApplicationApplicationConfigurationSqlApplicationConfigurationInputInputStartingPositionConfigurationArgs build() {
            return $;
        }
    }

}
