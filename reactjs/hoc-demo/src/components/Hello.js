import HocBlue from './HocBlue';
const Hello=(props)=><div>
<p style={{'color':props.color}}>Hello component here</p>
</div>
export default HocBlue(Hello);