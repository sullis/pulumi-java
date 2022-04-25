// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.glue.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Integer;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class JobNotificationPropertyGetArgs extends com.pulumi.resources.ResourceArgs {

    public static final JobNotificationPropertyGetArgs Empty = new JobNotificationPropertyGetArgs();

    /**
     * After a job run starts, the number of minutes to wait before sending a job run delay notification.
     * 
     */
    @Import(name="notifyDelayAfter")
    private @Nullable Output<Integer> notifyDelayAfter;

    /**
     * @return After a job run starts, the number of minutes to wait before sending a job run delay notification.
     * 
     */
    public Optional<Output<Integer>> notifyDelayAfter() {
        return Optional.ofNullable(this.notifyDelayAfter);
    }

    private JobNotificationPropertyGetArgs() {}

    private JobNotificationPropertyGetArgs(JobNotificationPropertyGetArgs $) {
        this.notifyDelayAfter = $.notifyDelayAfter;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(JobNotificationPropertyGetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private JobNotificationPropertyGetArgs $;

        public Builder() {
            $ = new JobNotificationPropertyGetArgs();
        }

        public Builder(JobNotificationPropertyGetArgs defaults) {
            $ = new JobNotificationPropertyGetArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param notifyDelayAfter After a job run starts, the number of minutes to wait before sending a job run delay notification.
         * 
         * @return builder
         * 
         */
        public Builder notifyDelayAfter(@Nullable Output<Integer> notifyDelayAfter) {
            $.notifyDelayAfter = notifyDelayAfter;
            return this;
        }

        /**
         * @param notifyDelayAfter After a job run starts, the number of minutes to wait before sending a job run delay notification.
         * 
         * @return builder
         * 
         */
        public Builder notifyDelayAfter(Integer notifyDelayAfter) {
            return notifyDelayAfter(Output.of(notifyDelayAfter));
        }

        public JobNotificationPropertyGetArgs build() {
            return $;
        }
    }

}
