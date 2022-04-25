// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.transcoder_v1.inputs;

import com.pulumi.core.annotations.Import;
import com.pulumi.googlenative.transcoder_v1.inputs.AnimationEndResponse;
import com.pulumi.googlenative.transcoder_v1.inputs.AnimationFadeResponse;
import com.pulumi.googlenative.transcoder_v1.inputs.AnimationStaticResponse;
import java.util.Objects;


/**
 * Animation types.
 * 
 */
public final class AnimationResponse extends com.pulumi.resources.InvokeArgs {

    public static final AnimationResponse Empty = new AnimationResponse();

    /**
     * End previous animation.
     * 
     */
    @Import(name="animationEnd", required=true)
    private AnimationEndResponse animationEnd;

    /**
     * @return End previous animation.
     * 
     */
    public AnimationEndResponse animationEnd() {
        return this.animationEnd;
    }

    /**
     * Display overlay object with fade animation.
     * 
     */
    @Import(name="animationFade", required=true)
    private AnimationFadeResponse animationFade;

    /**
     * @return Display overlay object with fade animation.
     * 
     */
    public AnimationFadeResponse animationFade() {
        return this.animationFade;
    }

    /**
     * Display static overlay object.
     * 
     */
    @Import(name="animationStatic", required=true)
    private AnimationStaticResponse animationStatic;

    /**
     * @return Display static overlay object.
     * 
     */
    public AnimationStaticResponse animationStatic() {
        return this.animationStatic;
    }

    private AnimationResponse() {}

    private AnimationResponse(AnimationResponse $) {
        this.animationEnd = $.animationEnd;
        this.animationFade = $.animationFade;
        this.animationStatic = $.animationStatic;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(AnimationResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private AnimationResponse $;

        public Builder() {
            $ = new AnimationResponse();
        }

        public Builder(AnimationResponse defaults) {
            $ = new AnimationResponse(Objects.requireNonNull(defaults));
        }

        /**
         * @param animationEnd End previous animation.
         * 
         * @return builder
         * 
         */
        public Builder animationEnd(AnimationEndResponse animationEnd) {
            $.animationEnd = animationEnd;
            return this;
        }

        /**
         * @param animationFade Display overlay object with fade animation.
         * 
         * @return builder
         * 
         */
        public Builder animationFade(AnimationFadeResponse animationFade) {
            $.animationFade = animationFade;
            return this;
        }

        /**
         * @param animationStatic Display static overlay object.
         * 
         * @return builder
         * 
         */
        public Builder animationStatic(AnimationStaticResponse animationStatic) {
            $.animationStatic = animationStatic;
            return this;
        }

        public AnimationResponse build() {
            $.animationEnd = Objects.requireNonNull($.animationEnd, "expected parameter 'animationEnd' to be non-null");
            $.animationFade = Objects.requireNonNull($.animationFade, "expected parameter 'animationFade' to be non-null");
            $.animationStatic = Objects.requireNonNull($.animationStatic, "expected parameter 'animationStatic' to be non-null");
            return $;
        }
    }

}
