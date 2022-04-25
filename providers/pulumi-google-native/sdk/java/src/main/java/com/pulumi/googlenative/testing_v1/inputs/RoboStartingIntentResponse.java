// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.testing_v1.inputs;

import com.pulumi.core.annotations.Import;
import com.pulumi.googlenative.testing_v1.inputs.LauncherActivityIntentResponse;
import com.pulumi.googlenative.testing_v1.inputs.StartActivityIntentResponse;
import java.lang.String;
import java.util.Objects;


/**
 * Message for specifying the start activities to crawl.
 * 
 */
public final class RoboStartingIntentResponse extends com.pulumi.resources.InvokeArgs {

    public static final RoboStartingIntentResponse Empty = new RoboStartingIntentResponse();

    /**
     * An intent that starts the main launcher activity.
     * 
     */
    @Import(name="launcherActivity", required=true)
    private LauncherActivityIntentResponse launcherActivity;

    /**
     * @return An intent that starts the main launcher activity.
     * 
     */
    public LauncherActivityIntentResponse launcherActivity() {
        return this.launcherActivity;
    }

    /**
     * An intent that starts an activity with specific details.
     * 
     */
    @Import(name="startActivity", required=true)
    private StartActivityIntentResponse startActivity;

    /**
     * @return An intent that starts an activity with specific details.
     * 
     */
    public StartActivityIntentResponse startActivity() {
        return this.startActivity;
    }

    /**
     * Timeout in seconds for each intent.
     * 
     */
    @Import(name="timeout", required=true)
    private String timeout;

    /**
     * @return Timeout in seconds for each intent.
     * 
     */
    public String timeout() {
        return this.timeout;
    }

    private RoboStartingIntentResponse() {}

    private RoboStartingIntentResponse(RoboStartingIntentResponse $) {
        this.launcherActivity = $.launcherActivity;
        this.startActivity = $.startActivity;
        this.timeout = $.timeout;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(RoboStartingIntentResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private RoboStartingIntentResponse $;

        public Builder() {
            $ = new RoboStartingIntentResponse();
        }

        public Builder(RoboStartingIntentResponse defaults) {
            $ = new RoboStartingIntentResponse(Objects.requireNonNull(defaults));
        }

        /**
         * @param launcherActivity An intent that starts the main launcher activity.
         * 
         * @return builder
         * 
         */
        public Builder launcherActivity(LauncherActivityIntentResponse launcherActivity) {
            $.launcherActivity = launcherActivity;
            return this;
        }

        /**
         * @param startActivity An intent that starts an activity with specific details.
         * 
         * @return builder
         * 
         */
        public Builder startActivity(StartActivityIntentResponse startActivity) {
            $.startActivity = startActivity;
            return this;
        }

        /**
         * @param timeout Timeout in seconds for each intent.
         * 
         * @return builder
         * 
         */
        public Builder timeout(String timeout) {
            $.timeout = timeout;
            return this;
        }

        public RoboStartingIntentResponse build() {
            $.launcherActivity = Objects.requireNonNull($.launcherActivity, "expected parameter 'launcherActivity' to be non-null");
            $.startActivity = Objects.requireNonNull($.startActivity, "expected parameter 'startActivity' to be non-null");
            $.timeout = Objects.requireNonNull($.timeout, "expected parameter 'timeout' to be non-null");
            return $;
        }
    }

}
