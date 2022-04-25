// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.awsnative.iotsitewise.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * Contains the configuration information of an alarm created in an AWS IoT SiteWise Monitor portal. You can use the alarm to monitor an asset property and get notified when the asset property value is outside a specified range.
 * 
 */
public final class AlarmsProperties extends com.pulumi.resources.InvokeArgs {

    public static final AlarmsProperties Empty = new AlarmsProperties();

    /**
     * The ARN of the IAM role that allows the alarm to perform actions and access AWS resources and services, such as AWS IoT Events.
     * 
     */
    @Import(name="alarmRoleArn")
    private @Nullable String alarmRoleArn;

    /**
     * @return The ARN of the IAM role that allows the alarm to perform actions and access AWS resources and services, such as AWS IoT Events.
     * 
     */
    public Optional<String> alarmRoleArn() {
        return Optional.ofNullable(this.alarmRoleArn);
    }

    /**
     * The ARN of the AWS Lambda function that manages alarm notifications. For more information, see Managing alarm notifications in the AWS IoT Events Developer Guide.
     * 
     */
    @Import(name="notificationLambdaArn")
    private @Nullable String notificationLambdaArn;

    /**
     * @return The ARN of the AWS Lambda function that manages alarm notifications. For more information, see Managing alarm notifications in the AWS IoT Events Developer Guide.
     * 
     */
    public Optional<String> notificationLambdaArn() {
        return Optional.ofNullable(this.notificationLambdaArn);
    }

    private AlarmsProperties() {}

    private AlarmsProperties(AlarmsProperties $) {
        this.alarmRoleArn = $.alarmRoleArn;
        this.notificationLambdaArn = $.notificationLambdaArn;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(AlarmsProperties defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private AlarmsProperties $;

        public Builder() {
            $ = new AlarmsProperties();
        }

        public Builder(AlarmsProperties defaults) {
            $ = new AlarmsProperties(Objects.requireNonNull(defaults));
        }

        /**
         * @param alarmRoleArn The ARN of the IAM role that allows the alarm to perform actions and access AWS resources and services, such as AWS IoT Events.
         * 
         * @return builder
         * 
         */
        public Builder alarmRoleArn(@Nullable String alarmRoleArn) {
            $.alarmRoleArn = alarmRoleArn;
            return this;
        }

        /**
         * @param notificationLambdaArn The ARN of the AWS Lambda function that manages alarm notifications. For more information, see Managing alarm notifications in the AWS IoT Events Developer Guide.
         * 
         * @return builder
         * 
         */
        public Builder notificationLambdaArn(@Nullable String notificationLambdaArn) {
            $.notificationLambdaArn = notificationLambdaArn;
            return this;
        }

        public AlarmsProperties build() {
            return $;
        }
    }

}
